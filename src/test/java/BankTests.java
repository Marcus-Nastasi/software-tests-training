import com.santander.tests.Domain.Account.Account;
import com.santander.tests.Domain.Account.CurrentAccount;
import com.santander.tests.Domain.Account.SavingsAccount;
import com.santander.tests.Domain.Bank.Bank;
import com.santander.tests.Domain.Client.Client;
import com.santander.tests.Domain.Client.Person;
import com.santander.tests.Exceptions.BankException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTests {

    private final Bank bank = new Bank();
    private final Person client = new Client("Jack", "123812793817");
    private final Person client2 = new Client("Logan", "12381279892389");
    private final Account account = new CurrentAccount(1000, 1004, client);
    private final Account account2 = new CurrentAccount(1004, 1004, client);
    private final Account savingsAccount = new SavingsAccount(1002, 1004, client);

    @Test
    void testingAddClient() {
        bank.addClient(client);
        Assertions.assertEquals("Jack", bank.getClient(client).getName());
    }

    @Test
    void testingAddAccountOnHashMap() {
        bank.addAccount(account);
        Assertions.assertEquals(account, bank.getAccount(account.getId()));
        bank.addAccount(savingsAccount);
        Assertions.assertEquals(2, bank.getAccountHashMap().size());
        Assertions.assertEquals(savingsAccount, bank.getAccount(1002));
    }

    @Test
    void testingGetClient() {
        bank.addClient(client);
        Assertions.assertEquals(client, bank.getClient(client));
        Assertions.assertEquals(client, bank.getClient("123812793817"));
    }

    @Test
    void testingGetAccount() {
        bank.addAccount(account);
        Assertions.assertEquals(account, bank.getAccount(1000));
    }

    @Test
    void testingExceptions() {
        bank.addAccount(account);
        Assertions.assertThrows(BankException.class, () -> bank.addAccount(account));
        Assertions.assertDoesNotThrow(() -> bank.addAccount(account2));

        bank.addClient(client);
        Assertions.assertThrows(BankException.class, () -> bank.addClient(client));
        Assertions.assertDoesNotThrow(() -> bank.addClient(client2));
    }
}


