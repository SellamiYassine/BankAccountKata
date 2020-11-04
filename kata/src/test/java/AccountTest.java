import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {

    private Account account;

    @BeforeEach
    public void setUp() {
        account = new Account(1L,"1");
    }

    @Test
    void create_account_test() {
        Assertions.assertTrue(account.getBalance() == 0.0);
        Assertions.assertTrue(account.getListOperation().size() == 0);
    }
}