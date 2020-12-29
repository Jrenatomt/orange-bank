package com.orange.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orange.bank.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
