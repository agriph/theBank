package com.bank.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bank.entities.Transaction;

	@Service
	public class OldTransactionRepository {

    Map<Long, Transaction> transactions = new HashMap<Long, Transaction>();

    public Collection<Transaction> getAll() {
        return transactions.values();
    }

    public Transaction getById(Long id) {
        return transactions.get(id);
    }

    public Transaction addTransaction(Transaction transaction) {
    	transactions.put(transaction.getId(), transaction);
        return transactions.get(transaction.getId());
    }

    public Transaction updateTransaction(Long id, Transaction transaction) {
    	transactions.put(id, transaction);
        return transactions.get(id);
    }

}

