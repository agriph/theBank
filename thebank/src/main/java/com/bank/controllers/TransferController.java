package com.bank.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.bank.entities.Transfer;
import com.bank.requests.AddTransferRequest;
import com.bank.services.TransferService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/bankapi/accounts/balances/transfers")
public class TransferController {

	@Autowired
	private TransferService transferService;

	
	@GetMapping("/")
	@ApiOperation(
			value = "All transfers",
			notes = "Lists all transfers",
			response = Transfer.class,
			responseContainer = "List")
	public Collection<Transfer> getAll() {
		return transferService.getAll();
	}
	
	@GetMapping("/id/{id}")
	@ApiOperation(
			value = "Get transfers by Id",
			notes = "View transfer info by using transfer Id",
			response = Transfer.class)
	public Transfer getById(@ApiParam (value = "ID of transfer", required = true) @PathVariable Long id) {
		return transferService.getById(id);
	}

	
	@PostMapping("/")
	@ApiOperation(
			value = "Add new transfer",
			notes = "Add a new transfer to an account",
			response = Transfer.class)
	public Transfer addNewTransfer(@RequestBody AddTransferRequest request) {
		return transferService.addTransaction(request);
	}
		

	
	@DeleteMapping("/{id}")
	@ApiOperation(
			value = "Delete transfer",
			notes = "This removes the transfer from the account",
			response = Transfer.class)
	public void deleteTransfer(@PathVariable Long id) {
		transferService.deleteTransfer(id);
	}

}
