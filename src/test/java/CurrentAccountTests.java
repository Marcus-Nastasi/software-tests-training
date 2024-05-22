import com.santander.tests.Domain.Account.Account;
import com.santander.tests.Domain.Account.CurrentAccount;
import com.santander.tests.Domain.Client.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CurrentAccountTests {

    private final Client client = new Client("Henry", "122222222");
    private final Account account = new CurrentAccount(1000, 1004, client);

    @Test
    void testingConstructor() {
        Assertions.assertEquals(1000, account.getId());
        Assertions.assertEquals(1004, account.getAgency());
        Assertions.assertEquals(client, account.getClient());
    }


    @Test
    void testingWithdraw() {
        account.deposit(100);
        account.withdraw(50);
        Assertions.assertEquals(50, account.getBalance());
    }
}


