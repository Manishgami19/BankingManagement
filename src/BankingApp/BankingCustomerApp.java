package BankingApp;

import java.util.Scanner;

public class BankingCustomerApp {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        BankAccount option = new BankAccount();

        //create initial accounts
        System.out.print("How Many Customer U Want to Input : ");
        int n = sc.nextInt();
        TransactionDetails cust[] = new TransactionDetails[n];

        for (int i = 0; i < cust.length; i++)
        {
            cust[i] = new TransactionDetails();
            System.out.println("\n");
            cust[i].openAccount();
        }
        int opt;
        do {
            option.showOption();
            System.out.println("Ur Choice :");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    for (int i = 0; i < cust.length; i++) {
                        cust[i].showAccount();
                    }
                    break;

                case 2:
                    System.out.print("Enter Account No U Want to Search...: ");
                    String acn = sc.next();
                    boolean found = false;
                    for (int i = 0; i < cust.length; i++){
                        found = cust[i].search(acn);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search Failed..Account Not Exist..");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account No : ");
                    acn = sc.next();
                    found = false;
                    for (int i = 0; i < cust.length; i++) {
                        found = cust[i].search(acn);
                        if (found) {
                            cust[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search Failed..Account Not Exist..");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account No : ");
                    acn = sc.next();
                    found = false;
                    for (int i = 0; i < cust.length; i++) {
                        found = cust[i].search(acn);
                        if (found) {
                            cust[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search Failed..Account Not Exist..");
                    }
                    break;

                case 5:
                    System.out.println("Good Bye..");
                    break;
            }
        } while (opt != 5);
    }
}