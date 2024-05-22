import com.santander.tests.Domain.Client.Client;
import com.santander.tests.Domain.Client.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClientTests {

    @Test
    void testingConstructor() {
        Person person = new Client("Joshua", "33457765");
        Assertions.assertEquals("Joshua", person.getName());
        Assertions.assertEquals("33457765", person.getCpf());
    }
}


