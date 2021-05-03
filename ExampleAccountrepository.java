public class ExampleAccountrepository
import java.util.Collection;
        import java.util.HashMap;
        import java.util.Map;
        import java.util.UUID;

        import org.springframework.stereotype.Service;

        import com.example.entities.Account;

@Service
public class AccountInMemoryRepository {

    Map<UUID, Account> Accounts = new HashMap<UUID, Account>();

    public Collection<Account> getAll() {
        return Accounts.values();
    }

    public Account getById(UUID id) {
        return accounts.get(id);
    }

    public Account addAccount(Account account) {
        accounts.put(account.getId(), account);
        return accounts.get(account.getId());
    }

    public Account updateAccount(UUID id, Account account) {
        Account.put(id, account);
        return Accounts.get(id);
    }

    public void deleteAccount(UUID id) {
        Accounts.remove(id);
    }{
}
