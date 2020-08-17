package BankingApp;
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
        Custname = sc.nextLine();
        System.out.print("Enter initial Balance: ");
        balance = sc.nextInt();
        System.out.print("********************************************");
    }

    //method to display account details
    void showAccount(){
        System.out.println("\n");
        System.out.println("Customer Name: " + Custname);
        System.out.println("Current Balance: " + balance);
        System.out.println("Generated Account Number: " + AccNo);
    }
    void showOption() {
        System.out.println("\n");
        System.out.println("Following options available: ");
        System.out.println("1 : Display all accounts");
        System.out.println("2 : Search Your Account");
        System.out.println("3 : Deposit");
        System.out.println("4 : Withdraw");
        System.out.println("5 : EXIT");
        System.out.print("********************************************");
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
