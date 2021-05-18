package com.bank.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bank.entities.Account;

	@Service
	public class OldAccountRepository {

    Map<Long, Account> accounts = new HashMap<Long, Account>();
    Map<String, Account> accountNames = new HashMap<String, Account>();

    public Collection<Account> getAll() {
        return accounts.values();
    }

    public Account getById(Long id) {
        return accounts.get(id);
    }
    
    public Account getByName(String firstName, String lastName) {
        return accountNames.get(firstName + lastName);
    }

    public Account addAccount(Account account) {
        accounts.put(account.getId(), account);
        return accounts.get(account.getId());
    }

    public Account updateAccount(Long id, Account account) {
        accounts.put(id, account);
        return accounts.get(id);
    }

    public void deleteAccount(Long id) {
        accounts.remove(id);
    }
}
