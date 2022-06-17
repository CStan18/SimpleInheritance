import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


class CheckingAccountTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        CheckingAccount ca = new CheckingAccount();
        ca.deposit(100);
        assertEquals(100, ca.getBalance());
    }

    @org.junit.jupiter.api.Test
    void withdrawal() {
        CheckingAccount ca = new CheckingAccount();
        ca.deposit(100);
        ca.withdrawal(50);
        assertEquals(50, ca.getBalance());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        CheckingAccount ca = new CheckingAccount();
        ca.setFirstName("Mojo");
        assertEquals("Mojo", ca.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        CheckingAccount ca = new CheckingAccount();
        ca.setLastName("Jojo");
        assertEquals("Jojo", ca.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setAccontID() {
        CheckingAccount ca = new CheckingAccount();
        ca.setAccountID(12345);
        assertEquals(12345, ca.getAccountID());
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
        CheckingAccount ca = new CheckingAccount();
        ca.setFirstName("Mojo");
        assertEquals("Mojo", ca.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        CheckingAccount ca = new CheckingAccount();
        ca.setLastName("Jojo");
        assertEquals("Jojo", ca.getLastName());
    }

    @org.junit.jupiter.api.Test
    void getAccountID() {
        CheckingAccount ca = new CheckingAccount();
        ca.setAccountID(12345);
        assertEquals(12345, ca.getAccountID());

    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        CheckingAccount ca = new CheckingAccount();
        ca.deposit(500);
        assertEquals(500, ca.getBalance());
    }


    @org.junit.jupiter.api.Test
    void processWithdrawal() {
        CheckingAccount ca = new CheckingAccount();
        ca.deposit(500);
        ca.withdrawal(550);
        ca.processWithdrawal();
        assertEquals(-80, ca.getBalance());
    }

    @org.junit.jupiter.api.Test
    void setInterestRate() {
        CheckingAccount ca = new CheckingAccount();
        ca.setInterestRate(15);
        assertEquals(15.0, ca.getInterestRate());
    }

    @org.junit.jupiter.api.Test
    void getInterestRate() {
        CheckingAccount ca = new CheckingAccount();
        ca.setInterestRate(15);
        assertEquals(15.0, ca.getInterestRate());
    }

    @org.junit.jupiter.api.Test
    void displayAccount() {
        CheckingAccount ca = new CheckingAccount();
        ca.setFirstName("Mojo");
        ca.setLastName("Jojo");
        ca.setAccountID(12345);
        ca.deposit(500);
        ca.setInterestRate(5.0);

        ca.displayAccount();
        assertTrue(outContent.toString().contains("Name: Mojo Jojo"));
        assertTrue(outContent.toString().contains("ID: 12345"));
        assertTrue(outContent.toString().contains("Balance: 500.0"));
        assertTrue(outContent.toString().contains("Interest Rate: 5.0"));
    }
}