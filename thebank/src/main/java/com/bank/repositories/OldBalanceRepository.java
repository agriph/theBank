package com.bank.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bank.entities.Balance;

	@Service
	public class OldBalanceRepository {

    Map<Long, Balance> balances = new HashMap<Long, Balance>();

    public Collection<Balance> getAll() {
        return balances.values();
    }

    public Balance addBalance(Balance balance) {
    	balances.put(balance.getId(), balance);
        return balances.get(balance.getId());
    }

    public Balance updateBalance(Long id, Balance balance) {
    	balances.put(id, balance);
        return balances.get(id);
    }

}