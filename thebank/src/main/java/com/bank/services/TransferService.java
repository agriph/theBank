package com.bank.services;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entities.Transfer;
import com.bank.repositories.TransferRepository;
import com.bank.requests.AddTransferRequest;
import com.bank.requests.UpdateTransferRequest;    

@Service
public class TransferService {
        	
@Autowired
TransferRepository transferRepo;
       
            
	public Collection<Transfer> getAll() {
	return transferRepo.findAll();
	}

	public Transfer getById(Long id) {
	return transferRepo.findById(id).get();
	}
	

	public Transfer addTransaction(AddTransferRequest request) {
	Transfer transfer = new Transfer();
	transfer.setSum(request.getSum());
		 
	return transferRepo.save(transfer);
	}

	public Transfer updateTransaction(UpdateTransferRequest request, Long id) {
	Transfer transfer = transferRepo.findById(id).get();
	transfer.setSum(request.getSum());
	transfer.setDate(new Date());
			
	return transferRepo.save(transfer);
	}
		
	public void deleteTransfer(Long id) {
	transferRepo.deleteById(id);
	}
	
}

