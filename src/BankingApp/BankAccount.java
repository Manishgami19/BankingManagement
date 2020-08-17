package BankingApp;
import java.util.Random;
import java.util.Scanner;

public class BankAccount {
    //String AccNo;
    String Custname;
    int balance;
    int AccNo;

    Scanner sc = new Scanner(System.in);

    //method to open an account
    void openAccount() {
        //System.out.print("Enter Account No: ");
        //AccNo = sc.next();
        System.out.print("Enter Name: ");
        Custname = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextInt();
    }

    //method to display account details
    void showAccount(){
        System.out.println("\n");
        System.out.println("Customer Name: " + Custname);
        System.out.println("initial balance: " + balance);
        System.out.println("Account num: " + AccNo);
    }
    void showOption() {
        System.out.println("\n");
        System.out.println("Following options available: ");
        System.out.println("1 : Display all accounts");
        System.out.println("2 : Search Your Account");
        System.out.println("3 : Deposit");
        System.out.println("4 : Withdraw");
        System.out.println("5 : EXIT");
    }
    boolean search(int acn) {
        if (AccNo == acn)
        {
            showAccount();
            return (true);
        }
        return (false);
    }
}
