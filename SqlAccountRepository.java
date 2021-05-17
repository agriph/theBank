package com.bank.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.entities.Account;

@Repository
public interface SqlAccountRepository extends JpaRepository<Account, Long> {

	
	List<Account> getByFirstName(String firstName);
	List<Account> getByLastName(String lastName);
	List<Account> getByCity(String city);
	
}
