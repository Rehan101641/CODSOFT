public class BankAccount{
    private String accountName;
    private String accountNumber;
    private double balance;
    public  BankAccount (String accountName, String accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountName() {
        return accountName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void Deposit(double amount)
    {
        balance=balance+amount;
    }
    public void withdraw( double amount)
    {
        balance=balance-amount;
    }
}
