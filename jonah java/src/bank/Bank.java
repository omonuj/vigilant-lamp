package bank;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();
    private int totalNumberOfAccounts;

    public Account createAccount(String accountName, String accountPin) {
        String accountNumber = accountNumberGenerator();
        Account account = new Account(accountName, accountNumber, accountPin);
        accounts.add(account);
        return account;
    }

    private String accountNumberGenerator() {
        totalNumberOfAccounts+=1;
        return"223344556"+totalNumberOfAccounts;
    }

    private Account accountNumberValidator(String accountNumber) {
        for (Account account : accounts) {
            if(account.getNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public String deposit(String accountNumber, double amount) {
        Account foundAccountNumber = accountNumberValidator(accountNumber);
        if(foundAccountNumber != null) {
            foundAccountNumber.deposit(amount);
            return String.format("Deposit of $ %.2f successful!!", amount);
        }
        return "Account not found";
    }

    public String transfer(String sendersAccount, String receiversAccount, double amount, String pin) {
        Account senderAccount = accountNumberValidator(sendersAccount);
        if (senderAccount != null) {
            Account receiverAccount = accountNumberValidator(receiversAccount);
            if (receiverAccount != null) {
                senderAccount.withdraw(amount, pin);
                receiverAccount.deposit(amount);
            }
            else return "account with " + receiversAccount + " not found";
        }
        return "account with " + sendersAccount + " not found";
    }

    public int getTotalNumberOfAccounts(){
        return totalNumberOfAccounts;
    }



}
