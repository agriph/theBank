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

import com.bank.entities.Transaction;
import com.bank.requests.AddTransactionRequest;
import com.bank.services.TransactionService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/bankapi/accounts/balances/transactions")
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	
	@GetMapping("/")
	@ApiOperation(
			value = "All transactions",
			notes = "Lists all transaction",
			response = Transaction.class,
			responseContainer = "List")
	public Collection<Transaction> getAll() {
		return transactionService.getAll();
	}
	
	@GetMapping("/id/{id}")
	@ApiOperation(
			value = "Get transactions by Id",
			notes = "View transaction info by using transaction Id",
			response = Transaction.class)
	public Transaction getById(@ApiParam (value = "ID of transaction", required = true) @PathVariable Long id) {
		return transactionService.getById(id);
	}
	
	@GetMapping("/{article}")
	@ApiOperation(
			value = "Get transactions by article",
			notes = "View transaction by providing bought article",
			response = Transaction.class)
	public Collection<Transaction> getByArticle(@PathVariable String article) {
	return transactionService.getByArticle(article);	
	}

	
	@PostMapping("/")
	@ApiOperation(
			value = "Add new transaction",
			notes = "Add a new transaction to an account",
			response = Transaction.class)
	public Transaction addNewTransaction(@RequestBody AddTransactionRequest request) {
		return transactionService.addTransaction(request);
	}
		

	@DeleteMapping("/{id}")
	@ApiOperation(
			value = "Delete transaction",
			notes = "This removes the transaction from the account",
			response = Transaction.class)
	public void deleteTransaction(@PathVariable Long id) {
		transactionService.deleteTransaction(id);
	}

}