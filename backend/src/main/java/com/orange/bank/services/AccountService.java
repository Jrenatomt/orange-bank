package com.orange.bank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orange.bank.dto.AccountDTO;
import com.orange.bank.entities.Account;
import com.orange.bank.repositories.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository repository;

	@Transactional
	public AccountDTO insert(AccountDTO dto) {
		Account entity = new Account();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new AccountDTO(entity);
	}

	private void copyDtoToEntity(AccountDTO dto, Account entity) {
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setCpf(dto.getCpf());
		entity.setBirthDate(dto.getBirthDate());
	}
}
