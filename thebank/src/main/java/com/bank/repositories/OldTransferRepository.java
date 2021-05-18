package com.bank.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bank.entities.Transfer;

	@Service
	public class OldTransferRepository {

    Map<Long, Transfer> transfers = new HashMap<Long, Transfer>();

    public Collection<Transfer> getAll() {
        return transfers.values();
    }

    public Transfer getById(Long id) {
        return transfers.get(id);
    }

    public Transfer addTransfer(Transfer transfer) {
    	transfers.put(transfer.getId(), transfer);
        return transfers.get(transfer.getId());
    }

    public Transfer updateTransfer(Long id, Transfer transfer) {
    	transfers.put(id, transfer);
        return transfers.get(id);
    }

}
