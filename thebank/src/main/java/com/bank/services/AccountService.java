package com.bank.services;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entities.Account;
import com.bank.entities.Balance;
import com.bank.repositories.AccountRepository;
import com.bank.requests.AddAccountRequest;
import com.bank.requests.UpdateAccountRequest;    

@Service
public class AccountService {
        	
@Autowired
AccountRepository accountRepo;
       
            
	public Collection<Account> getAll() {
	return accountRepo.findAll();
	}

	public Account getById(Long id) {
	return accountRepo.findById(id).get();
	}
	
	public Collection<Account> getByFirstName(String firstName) {
	return accountRepo.getByFirstName (firstName);
	}
	
	public Collection<Account> getByLastName(String lastName) {
	return accountRepo.getByLastName (lastName);
	}
	
	public Collection<Account> getByCity(String city) {
	return accountRepo.getByCity (city);
	}

	public void deleteAccount(Long id) {
	accountRepo.deleteById(id);
	}

	public Account addAccount(AddAccountRequest request) {
		
	Balance balance = new Balance();
		
	Account account = new Account();
	account.setFirstName(request.getFirstName());
	account.setLastName(request.getLastName());
	account.setAge(request.getAge());
	account.setCity(request.getCity());
	account.setDate(new Date());
	account.setBalance(balance);
	
	return accountRepo.save(account);
	}

	public Account updateAccount(UpdateAccountRequest request, Long id) {
	Account account = accountRepo.findById(id).get();
	account.setFirstName(request.getFirstName());
	account.setLastName(request.getLastName());
	account.setAge(request.getAge());
	account.setStreet(request.getStreet());
	account.setZipCode(request.getZipCode());
	account.setCity(request.getCity());
	account.setUpdate(new Date());
			
	return accountRepo.save(account);
	}
		
}
