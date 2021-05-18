package com.bank.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.bank.entities.Balance;
import com.bank.requests.AddBalanceRequest;
import com.bank.requests.UpdateBalanceRequest;
import com.bank.services.BalanceService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/bankapi/accounts/balances/")
public class BalanceController {

	@Autowired
	private BalanceService balanceService;

	
	@GetMapping("/")
	@ApiOperation(
			value = "Balance of an account",
			notes = "This views the current balance of an account",
			response = Balance.class)
	public Collection<Balance> getAll() {
		return balanceService.getAll();
	}
	
	@GetMapping("/id/{id}")
	@ApiOperation(
			value = "Get balance by Id",
			notes = "View balance info by using balance Id",
			response = Balance.class)
	public Balance getById(@ApiParam (value = "ID of balance", required = true) @PathVariable Long id) {
		return balanceService.getById(id);
	}
	

	@PostMapping("/")
	@ApiOperation(
			value = "Add new balance",
			notes = "Add a new balance to an account",
			response = Balance.class)
	public Balance addNewBalance(@RequestBody AddBalanceRequest request) {
		return balanceService.addBalance(request);
	}
		
	@PutMapping("/{id}")
	@ApiOperation(
			value = "Update balance",
			notes = "Update balance with new sum",
			response = Balance.class)
	public Balance updateBalance(@PathVariable Long id, @RequestBody UpdateBalanceRequest request) {
		return balanceService.updateBalance(request, id);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(
			value = "Delete balanace",
			notes = "This removes the balance from the account",
			response = Balance.class)
	public void deleteBalance(@PathVariable Long id) {
		balanceService.deleteBalance(id);
	}

}
