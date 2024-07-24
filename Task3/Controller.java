
import java.util.Scanner;

public class Controller {
     private static String accountNumber,accountName;
    private static double balance;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Account Numbrer");
        accountNumber=sc.nextLine();
        System.out.println("Enter Account Name");
        accountName=sc.nextLine();
        System.out.println("Enter the Initial Balance");
        balance=sc.nextInt();
        BankAccount account=new BankAccount(accountName, accountNumber,balance);
        ATM atm=new ATM(account);
        atm.Start();
    }   
}
