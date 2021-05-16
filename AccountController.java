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
	@ApiOperation(
			value = "Get account by Id",
			notes = "View account info by using account Id",
			response = Account.class)
	public Account getById(@ApiParam (value = "ID of accounts", required = true) @PathVariable UUID id) {
		return accountService.getById(id);
	}
	
	@GetMapping("/{name}")
	@ApiOperation(
			value = "Get account by first- or lastname",
			notes = "View account info using either first- or lastname of the accountholder",
			response = Account.class)
	public Account getByName(@ApiParam(value = "Name of Accountholder", required = true) @PathVariable String firstName, String lastName) {
	return accountService.getByName(firstName, lastName);
	}
	
	@PostMapping("/")
	@ApiOperation(
			value = "Add new account",
			notes = "Add a new account to the bank API",
			response = Account.class)
	public Account addNewAccount(@RequestBody AddAccountRequest request) {
		return accountService.addAccount(request);
	}
		
	
	@PutMapping("/{id}")
	@ApiOperation(
			value = "Update account",
			notes = "Update account with new information",
			response = Account.class)
	public Account updateAccount(@PathVariable UUID id, @RequestBody UpdateAccountRequest request) {
		return accountService.updateAccount(request, id);
	}

	
	@DeleteMapping("/{id}")
	@ApiOperation(
			value = "Delete account",
			notes = "This removes the account from the bank API",
			response = Account.class)
	public void deleteAccount(@PathVariable UUID id) {
		accountService.deleteAccount(id);
	}

}