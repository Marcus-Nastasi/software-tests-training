import com.santander.tests.Domain.Account.Account;
import com.santander.tests.Domain.Account.CurrentAccount;
import com.santander.tests.Domain.Account.SavingsAccount;
import com.santander.tests.Domain.Client.Client;
import com.santander.tests.Exceptions.ClientException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClientTests {

    private final Client person = new Client("Joshua", "33457765");
    private final Account account = new CurrentAccount(1000, 1004, person);
    private final Account account2 = new SavingsAccount(1002, 1004, person);

    @Test
    void testingConstructor() {
        Assertions.assertEquals("Joshua", person.getName());
        Assertions.assertEquals("33457765", person.getCpf());
    }

    @Test
    void testingAddingAccount() {
        person.addAccount(account);
        person.addAccount(account2);
        Assertions.assertEquals(1000, person.getAccountList().getFirst().getId());
        Assertions.assertEquals(1004, person.getAccountList().getFirst().getAgency());
        Assertions.assertEquals(person, person.getAccountList().getFirst().getClient());
        Assertions.assertTrue(person.getAccountList().getFirst() instanceof CurrentAccount);
        Assertions.assertTrue(person.getAccountList().getLast() instanceof SavingsAccount);
    }

    @Test
    void testingRemoveAccount() {
        person.addAccount(account);
        Assertions.assertFalse(person.getAccountList().isEmpty());
        person.removeAccount(account);
        Assertions.assertTrue(person.getAccountList().isEmpty());
    }

    @Test
    void testingGetterOfAccounts() {
        person.addAccount(account);
        Assertions.assertEquals(account, person.getAccountList().getFirst());
    }

    @Test
    void testingExceptions() {
        Assertions.assertThrows(ClientException.class, () -> person.removeAccount(account));
        person.addAccount(account);
        Assertions.assertDoesNotThrow(() -> person.removeAccount(account));
    }
}


