import com.kata.entities.Account;
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

    @Test
    void deposit_positive_amount() throws IllegalArgumentException {
        //GIVEN
        int amount = 200;
        //WHEN
        account.deposit(amount);
        //THEN
        Assertions.assertTrue(account.getBalance() == 200.0);
        Assertions.assertTrue(account.getListOperation().size() == 1);
    }

    @Test
    void deposit_amount_equal_zero() {
        //GIVEN
        int amount = 0;

        //THEN
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(amount);
        });

        String expectedMessage = "cannot deposit zero";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.equals(expectedMessage));
        Assertions.assertTrue(account.getListOperation().size() == 0);
    }

    @Test
    void deposit_null_value() {

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(null);
        });

        String expectedMessage = "null value";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.equals(expectedMessage));
        Assertions.assertTrue(account.getListOperation().size() == 0);
    }

    @Test
    void deposit_negative_amount() {
        //GIVEN
        int amount = -200;

        //THEN
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(amount);
        });

        String expectedMessage = "cannot deposit negative amount";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.equals(expectedMessage));
        Assertions.assertTrue(account.getListOperation().size() == 0);
    }
}