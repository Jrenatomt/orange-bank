package com.orange.bank.services.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.orange.bank.dto.AccountDTO;
import com.orange.bank.entities.Account;
import com.orange.bank.repositories.AccountRepository;
import com.orange.bank.resources.exceptions.FieldMessage;


public class AccountInsertValidator implements ConstraintValidator<AccountInsertValid, AccountDTO> {
	
	@Autowired
	private AccountRepository repository;
	
	@Override
	public void initialize(AccountInsertValid ann) {
	}

	@Override
	public boolean isValid(AccountDTO dto, ConstraintValidatorContext context) {
		
		List<FieldMessage> list = new ArrayList<>();
		
		Account email = repository.findByEmail(dto.getEmail());
		Account cpf = repository.findByCpf(dto.getCpf());
		
		if (email != null) {
			list.add(new FieldMessage("email", "email existente"));
		}
		if (cpf != null) {
			list.add(new FieldMessage("cpf", "CPF existente"));
		}
		
		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}
