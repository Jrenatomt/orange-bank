package com.orange.bank.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.br.CPF;

import com.orange.bank.entities.Account;
import com.orange.bank.services.validation.AccountInsertValid;

@AccountInsertValid
public class AccountDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotEmpty(message = "campo obrigatório")
	private String name;
	
	@Email(message = "entre com um email válido")
	private String email;
	
	@CPF(message = "entre com um CPF válido")
	private String cpf;
	
	@PastOrPresent(message = "a data não pode ser do futuro")
	private Instant birthDate;
	
	public AccountDTO() {
	}
	
	public AccountDTO(Long id, String name, String email, String cpf, Instant birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.birthDate = birthDate;
	}
	
	public AccountDTO(Account entity) {
		id = entity.getId();
		name = entity.getName();
	    email = entity.getEmail();
	    cpf = entity.getCpf();
		birthDate = entity.getBirthDate();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}
}
