		package com.bank.services;

		import java.util.Collection;
        import java.util.Date;
        import java.util.UUID;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import com.bank.entities.Account;
        import com.bank.repositories.AccountRepository;
        import com.bank.requests.AddAccountRequest;
        import com.bank.requests.UpdateAccountRequest;    

        @Service
        public class AccountService {
        	
        @Autowired
        AccountRepository accountRepo;
        
        UUID id = UUID.randomUUID();
            
        public Collection<Account> getAll() {
        return accountRepo.getAll();
        }

        public Account getById(UUID id) {
        return accountRepo.getById(id);
        }
        
		public Account getByName(String firstName, String lastName) {
		return accountRepo.getByName(firstName, lastName);
		}

        public void deleteAccount(UUID id) {
        accountRepo.deleteAccount(id);
        }

		public Account addAccount(AddAccountRequest request) {
		 Account account = new Account();
		 account.setId(UUID.randomUUID());
		 account.setFirstName(request.getFirstName());
		 account.setLastName(request.getLastName());
		 account.setAge(request.getAge());
		 account.setCity(request.getCity());
		 account.setDate(request.getDate());
		 
		 return accountRepo.addAccount(account);
		}

		public Account updateAccount(UpdateAccountRequest request, UUID id) {
			Account account = accountRepo.getById(id);
			account.setFirstName(request.getFirstName());
			account.setLastName(request.getLastName());
			account.setAge(request.getAge());
			account.setCity(request.getCity());
			account.setUpdate(new Date());
			
			return accountRepo.updateAccount(id, account);
		}
		
   }
