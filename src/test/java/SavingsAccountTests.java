import com.santander.tests.Domain.Account.Account;
import com.santander.tests.Domain.Account.CurrentAccount;
import com.santander.tests.Domain.Client.Client;
import com.santander.tests.Domain.Client.Person;
import org.junit.jupiter.api.Test;

public class SavingsAccountTests {

    private final Person client = new Client("Henry", "122222222");
    private final Account account = new CurrentAccount(1000, 1004, client);
    private final Account account2 = new CurrentAccount(1001, 1004, client);

    @Test
    void testingConstructor() {

    }
}


