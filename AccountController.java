package com.example.controllers;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.domain.*;

@RestController
@RequestMapping("bankapi/account/")
public class AccountController {

	Map<Integer, Account> accounts = new HashMap<Integer, Account>();
	@Autowired

	
	@GetMapping("/{firstName}")
	public Account getByFirstName(@PathVariable String firstName) {
		return accounts.get(firstName);
		
	}
	
	@GetMapping("/{id}")
	public Account getById(@PathVariable int id) {
		return accounts.get(id);
		
 }
	
	@PostMapping("/")
	public Account addAccount(@RequestBody Account newAccount) {
		accounts.put(newAccount.getId(), newAccount);
		return newAccount;
		
	}
	
	@PutMapping("/{id}")
	public Account updateAccount(@PathVariable int id, @RequestBody Account updatedAccount) {
	Account account = accounts.get(id);
	account.setId(updatedAccount.getId());
	account.setFirstName(updatedAccount.getFirstName());
	account.setFirstName(updatedAccount.getFirstName());
	return updatedAccount;
		
	}
	
	@DeleteMapping("/{id}")
	public Account deleteAccount(@PathVariable int id) {
		accounts.remove(id);
		return null;
	}
}