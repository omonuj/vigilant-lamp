package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    Bank bank = new Bank();

    @Test
    public void testThatWhenAUserCreateAccountTotalNumberOfAccountisOne() {
        String name = "jonah odoh";
        String pin = "pin";
        bank.createAccount(name, pin);
        assertEquals(1, bank.getTotalNumberOfAccounts(), "number of accounts should be one");

    }

    @Test
    public void testThatWhenAUserCreateAccountTotalNumberOfAccountisTwo() {
        Account blue =bank.createAccount("jonah odoh", "pin");
        System.out.println(blue);
        Account red =bank.createAccount("Adebowale Abosede", "pin");
        System.out.println(red);
        assertEquals(2, bank.getTotalNumberOfAccounts(), "number of accounts should be two");
    }

    @Test
    public void testThatWhenAUserCreateAccountTotalNumberOfAccountisThree() {
        Account yellow = bank.createAccount("usuf odoh", "pin");
        System.out.println(yellow);
        Account red =bank.createAccount("sylvester odoh", "pin");
        System.out.println(red);
        Account blue =bank.createAccount("gloria odoh", "pin");
        System.out.println(blue);
        assertEquals(3, bank.getTotalNumberOfAccounts(), "number of accounts should be three");
    }



}
