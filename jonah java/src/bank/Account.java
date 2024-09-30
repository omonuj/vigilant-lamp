package bank;



public class Account {

    private String name;
    private double balance;
    private String number;
    private String pin;

    public Account(String name, String number, String pin) {
        this.name = name;
        this.number = number;
        this.pin = pin;
    }
    public void deposit(double amount) {
        boolean amountIsPositive = amount > 0;
        if (amountIsPositive) balance += amount;
    }
    public void withdraw(double amount, String pin) {
        boolean amountIsPositive = amount > 0;
        boolean balanceIsPositive = balance > amount;
        if(amountIsPositive && balanceIsPositive && (pinValidator(pin)))
            balance -= amount;
    }
    public boolean pinValidator(String pin) {
        return this.pin.equals(pin);
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public String getNumber() {
        return number;
    }
    public String getPin() {
        return pin;
    }

}