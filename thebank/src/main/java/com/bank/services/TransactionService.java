package com.bank.services;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entities.Transaction;
import com.bank.repositories.TransactionRepository;
import com.bank.requests.AddTransactionRequest;
import com.bank.requests.UpdateTransactionRequest;    

@Service
public class TransactionService {
        	
@Autowired
TransactionRepository transactionRepo;
       
            
	public Collection<Transaction> getAll() {
	return transactionRepo.findAll();
	}

	public Transaction getById(Long id) {
	return transactionRepo.findById(id).get();
	}
	
	public Collection<Transaction> getByArticle(String article) {
	return transactionRepo.getByArticle (article);
	}

	public Transaction addTransaction(AddTransactionRequest request) {
	Transaction transaction = new Transaction();
	transaction.setArticle(request.getArticle());
	transaction.setSum(request.getSum());
		 
	return transactionRepo.save(transaction);
	}

	public Transaction updateTransaction(UpdateTransactionRequest request, Long id) {
	Transaction transaction = transactionRepo.findById(id).get();
	transaction.setArticle(request.getArticle());
	transaction.setSum(request.getSum());
	transaction.setDate(new Date());
			
	return transactionRepo.save(transaction);
	}
	
	public void deleteTransaction(Long id) {
	transactionRepo.deleteById(id);
	}
		
}
