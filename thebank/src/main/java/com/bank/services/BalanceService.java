package com.bank.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entities.Balance;
import com.bank.entities.Transaction;
import com.bank.entities.Transfer;
import com.bank.repositories.BalanceRepository;
import com.bank.requests.AddBalanceRequest;
import com.bank.requests.UpdateBalanceRequest;    

@Service
public class BalanceService {
        	
@Autowired
BalanceRepository balanceRepo;
       
            
	public Collection<Balance> getAll() {
	return balanceRepo.findAll();
	}

	public Balance getById(Long id) {
	return balanceRepo.findById(id).get();
	}
	
	public void deleteBalance(Long id) {
		balanceRepo.deleteById(id);
	}

	public Balance addBalance(AddBalanceRequest request) {
		
	Balance balance = new Balance();
	balance.setSum(request.getSum());
	Transfer transfer = new Transfer();
	balance.setTransfers(request.getTransfers());
	Transaction transaction = new Transaction();
	balance.setTransactions(request.getTransactions());
	
	return balanceRepo.save(balance);
	}

	public Balance updateBalance(UpdateBalanceRequest request, Long id) {
	Balance balance = balanceRepo.findById(id).get();
	balance.setSum(request.getSum());
	balance.setUpdate(new Date());
			
	return balanceRepo.save(balance);
	}
		
}