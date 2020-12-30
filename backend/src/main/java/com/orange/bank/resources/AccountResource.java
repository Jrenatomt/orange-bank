package com.orange.bank.resources;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.orange.bank.dto.AccountDTO;
import com.orange.bank.services.AccountService;

@RestController
@RequestMapping(value = "/accounts")
public class AccountResource {
	
	@Autowired
	private AccountService service;
	
	@PostMapping
	public ResponseEntity<AccountDTO> insert(@Valid @RequestBody AccountDTO dto) {
		AccountDTO newDto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(newDto.getId()).toUri();
		return ResponseEntity.created(uri).body(newDto);
	}
}
