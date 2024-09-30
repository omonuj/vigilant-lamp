package bank;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    Account account = new Account("jonah", "1234", "1111");


    @Test
    public void testAccountWhen1000IsDepositedBalanceIs1000() {
        account.deposit(1000);
        double balance = account.getBalance();
        assertEquals(1000, balance,"Balance should be 1000 after deposit");
    }

    @Test
    public void testWhen10000IsDepositedBalanceIs10000() {
        account.deposit(10000);
        assertEquals(10000, account.getBalance());
        account.withdraw(5000,"1111");
        assertEquals(5000, account.getBalance(), "Balance should be 5000 after withdraw");
    }

    @Test
    public void testWhen10000IsDepositedAnd15000IsWithdrawnBalanceShouldBe10000() {
        account.deposit(10000);
        assertEquals(10000, account.getBalance());
        account.withdraw(15000,"1111");
        assertEquals(10000, account.getBalance(), "Balance should be 10000 after withdraw");
    }

    @Test
    public void testThatAccountBalanceIs10000DepositNegativeAmountBalanceShouldBe10000() {
        account.deposit(10000);
        assertEquals(10000, account.getBalance());
        account.deposit(-5000);
        assertEquals(10000, account.getBalance(), "Balance should be 10000 after withdraw");
    }

    @Test
    public void testThatAccountBalanceIs10000WithdrawNegativeAmountBalanceShouldBe10000() {
        account.deposit(10000);
        assertEquals(10000, account.getBalance());
        account.withdraw(-5000,"1111");
        assertEquals(10000, account.getBalance(), "Balance should be 10000 after withdraw");
    }

    @Test
    public void testThatAccountBalanceIs10000Withdraw10000BalanceShouldBe0() {
        account.deposit(10000);
        assertEquals(10000, account.getBalance());
        account.withdraw(9999,"1111");
        assertEquals(1, account.getBalance(), "Balance should be 0 after withdraw");
    }

    @Test
    public void testThatAccountBalanceIs10000Withdraw15000BalanceShouldBe10000(){
        account.deposit(10000);
        assertEquals(10000, account.getBalance());
        account.withdraw(15000,"1111");
        assertEquals(10000, account.getBalance(), "Balance should be 10000 after withdraw");
    }

}