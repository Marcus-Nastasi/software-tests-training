import com.santander.tests.Domain.Account.Account;
import com.santander.tests.Domain.Account.SavingsAccount;
import com.santander.tests.Domain.Client.Client;
import com.santander.tests.Domain.Client.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingsAccountTests {

    private final Person client = new Client("Henry", "122222222");
    private final Account account = new SavingsAccount(1000, 1004, client);
    private final Account account2 = new SavingsAccount(1001, 1004, client);

    @Test
    void testingConstructor() {
        Assertions.assertEquals(1000, account.getId());
        Assertions.assertEquals(1004, account.getAgency());
        Assertions.assertEquals(client, account.getClient());
    }

    @Test
    void testingProfitMethod() {
        account.deposit(100);
        if (account instanceof SavingsAccount) ((SavingsAccount) account).profit();
        Assertions.assertEquals(110, account.getBalance());
    }
}


