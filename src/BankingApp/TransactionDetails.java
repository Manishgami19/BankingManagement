package BankingApp;
import java.util.Random;

public class TransactionDetails extends BankAccount{
    //method to deposit money
    void deposit() {
        int amt;
        System.out.println("Enter Amount U Want to Deposit : ");
        amt = sc.nextInt();
        balance = balance + amt;
    }
    TransactionDetails()
    {
        Random rand = new Random();
        int low = 300000000;
        int high = 400000000;
        AccNo = rand.nextInt(high-low) + low;
    }
    //method to withdraw money
    void withdrawal() {
        int amt;
        System.out.println("Enter Amount U Want to withdraw : ");
        amt = sc.nextInt();
        if (balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.println("Less Balance..Transaction Failed..");
        }
    }
}
