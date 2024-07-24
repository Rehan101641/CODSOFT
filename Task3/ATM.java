import java.util.Scanner;
public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void Start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Withraw\n2.Deposit\n3.Check balance\n4.Exit\nEnter your choice");
            int n = sc.nextInt();
            switch (n) {
                // USING ENHANCE SWITCH CASE
                case 1 -> {
                    System.out.println("Enter the amount yout want withraw");
                    double amount = sc.nextDouble();
                    withdraw(amount);
                }
                case 2 -> {
                    System.out.println("Enter the amount you want to deposit");
                    double amount = sc.nextDouble();
                    deposit(amount);
                }
                case 3 -> {
                    System.out.println("Your Balance is " + checkBalance());
                }
                case 4 -> {
                    System.out.println("Thank You for using Atm Machine");
                    return;
                }
                default -> {
                    System.out.println("Invalid Choice Enter again");
                }
            }
        }
    }

    public void withdraw(double amount) {
        if(amount<=account.getBalance())
        {
            account.withdraw(amount);
            System.out.println("Withdraw Successful \nYour balance is-->"+account.getBalance());
        }
        else
        System.out.println("Insufficient Balance");
    }
    public void deposit(double amount)
    {
        account.Deposit(amount);
        System.out.println("Sucessfully deposit\n Your Balance is-->"+account.getBalance());
    }
    public double checkBalance()
    {
        return account.getBalance();
    }
}
