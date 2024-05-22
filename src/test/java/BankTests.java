import com.santander.tests.Domain.Account.Account;
import com.santander.tests.Domain.Account.CurrentAccount;
import com.santander.tests.Domain.Bank.Bank;
import com.santander.tests.Domain.Client.Client;
import com.santander.tests.Domain.Client.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTests {

    private final Bank bank = new Bank();
    private final Person client = new Client("Jack", "123812793817");
    private final Account account = new CurrentAccount(1000, 1004, client);

    @Test
    void testingAddClient() {
        bank.addClient(client);
        bank.addAccount(account);
        Assertions.assertEquals("Jack", bank.getClient(client).getName());
    }

    @Test
    void testingGetClient() {
        bank.addClient(client);
        Assertions.assertEquals(client, bank.getClient(client));
        Assertions.assertEquals(client, bank.getClient("123812793817"));
    }
}
