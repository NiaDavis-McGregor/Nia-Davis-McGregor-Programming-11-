import org.junit.Before;
import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer newCustomer;


    @Before
    public void setup() {
        newCustomer = new Customer();
    }


    @Test
    public void testDeposit() {
        //adds new Deposit to deposits (CHECKING)
        newCustomer.deposit(100.00, new Date(), Customer.CHECKING);
        double checkingBalance = newCustomer.getCheckingBalance();
        assertEquals(checkingBalance, 100.00, 0.01);

        //adds new Deposit to SAVING
        newCustomer.deposit(50.00, new Date(), Customer.SAVING);
        double savingBalance = newCustomer.getSavingBalance();
        assertEquals(savingBalance, 50.00, 0.01);

        //checks that amount has to be >= 0
        newCustomer.deposit(-10.00, new Date(), Customer.CHECKING);
        assertEquals(checkingBalance, 100.00, 0.01);

    }

    @Test
    public void testWithdraw() {
        //adds new Withdraw to withdraws
        newCustomer.withdraw(10.00, new Date(), Customer.CHECKING);
        double checkingBalance = newCustomer.getCheckingBalance();
        assertEquals(checkingBalance, -10.00, 0.01);

        //withdraw from SAVING
        newCustomer.withdraw(5.00, new Date(), Customer.SAVING);
        double savingBalance = newCustomer.getSavingBalance();
        assertEquals(savingBalance, -5.00, 0.01);

        //checks that amount >= 0
        newCustomer.withdraw(-20.00, new Date(), Customer.CHECKING);
        assertEquals(checkingBalance, -10.00, 0.01);

        //test overdraft
        newCustomer.withdraw(100.00, new Date(), Customer.CHECKING);
        assertEquals(newCustomer.getCheckingBalance(), -10.00, 0.01);

    }

}
