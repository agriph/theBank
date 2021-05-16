package com.bank.controllers;

import java.util.Collection;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.bank.entities.Account;
import com.bank.requests.AddAccountRequest;
import com.bank.requests.UpdateAccountRequest;
import com.bank.services.AccountService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/bankapi/account/")
public class AccountController {

	@Autowired
	private AccountService accountService;

	
	@GetMapping("/")
	@ApiOperation(
			value = "All accounts",
			notes = "Lists all accounts",
			response = Account.class,
			responseContainer = "List")
	public Collection<Account> getAll() {
		return accountService.getAll();
	}
	
	@GetMapping("/{id}")
	public Account getById(@ApiParam (value = "ID of accounts", required = true) @PathVariable UUID id) {
		return accountService.getById(id);
	}
	
	@GetMapping("/{name}")
	public Account getByName(@ApiParam(value = "Name of Accountholder", required = true) @PathVariable String firstName, String lastName) {
	return accountService.getByName(firstName, lastName);
	}
	
	@PostMapping("/")
	public Account addNewAccount(@RequestBody AddAccountRequest request) {
		return accountService.addAccount(request);
	}
		
	
	@PutMapping("/{id}")
	public Account updateAccount(@PathVariable UUID id, @RequestBody UpdateAccountRequest request) {
		return accountService.updateAccount(request, id);
	}

	
	@DeleteMapping("/{id}")
	public void deleteAccount(@PathVariable UUID id) {
		accountService.deleteAccount(id);
	}

}