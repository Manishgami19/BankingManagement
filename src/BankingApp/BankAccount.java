package BankingApp;
import java.util.Scanner;

public class BankAccount {
    String AccNo;
    String Custname;
    int balance;

    Scanner sc = new Scanner(System.in);

    //method to open an account
    void openAccount() {
        System.out.print("Enter Account No: ");
        AccNo = sc.next();
        System.out.print("Enter Name: ");
        Custname = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextInt();
    }
    //method to display account details
    void showAccount(){
        System.out.println("\n");
        System.out.println("Account No: " + AccNo);
        System.out.println("Customer Name: " + Custname);
        System.out.println("initial balance: " + balance);
    }
    void showOption() {
        System.out.println("Following options available: ");
        System.out.println("1 : Display all accounts");
        System.out.println("2 : Search Your Account");
        System.out.println("3 : Deposit");
        System.out.println("4 : Withdraw");
        System.out.println("5 : EXIT");
    }
    boolean search(String acn) {
        if (AccNo.equals(acn))
        {
            showAccount();
            return (true);
        }
        return (false);
    }
}
