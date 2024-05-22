import com.santander.tests.Domain.Account.Account;
import com.santander.tests.Domain.Account.CurrentAccount;
import com.santander.tests.Domain.Client.Client;
import com.santander.tests.Domain.Client.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CurrentAccountTests {

    private final Person client = new Client("Henry", "122222222");
    private final Account account = new CurrentAccount(1000, 1004, client);
    private final Account account2 = new CurrentAccount(1001, 1004, client);

    @Test
    void testingConstructor() {
        Assertions.assertEquals(1000, account.getId());
        Assertions.assertEquals(1004, account.getAgency());
        Assertions.assertEquals(client, account.getClient());
    }

    @Test
    void testingTransferBetweenAccounts() {
        account.deposit(100);
        account.transferBetweenAccounts(account2, 100);
        Assertions.assertEquals(0.0, account.getBalance());
        Assertions.assertEquals(100, account2.getBalance());
    }

    @Test
    void testingDeposit() {
        account.deposit(100);
        Assertions.assertEquals(100, account.getBalance());
    }

    @Test
    void testingWithdraw() {
        account.deposit(100);
        account.withdraw(50);
        Assertions.assertEquals(50, account.getBalance());
    }
}


