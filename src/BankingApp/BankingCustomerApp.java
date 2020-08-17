package BankingApp;
import java.util.Scanner;
public class BankingCustomerApp {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        BankAccount option = new BankAccount();
        //create initial accounts
        System.out.print("How Many Customer you Want to add : ");
        int n = sc.nextInt();
        System.out.print("********************************************");
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
            System.out.println("\nYour Choice :");
            opt = sc.nextInt();
            System.out.print("********************************************");
            switch (opt) {
                case 1:
                    for (int i = 0; i < cust.length; i++) {
                        cust[i].showAccount();
                        System.out.print("********************************************");
                    }
                    break;
                case 2:
                    System.out.print("Enter Account No U Want to Search...: ");
                    int acn = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < cust.length; i++)
                    {
                        found = cust[i].search(acn);
                        if (found)
                        {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search Failed..Account Not Exist..");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account No : ");
                    acn = sc.nextInt();
                    found = false;
                    for (int i = 0; i < cust.length; i++)
                    {
                        found = cust[i].search(acn);
                        if (found)
                        {
                            cust[i].deposit();
                            break;
                        }
                    }
                    if (!found)
                    {
                        System.out.println("Search Failed..Account Not Exist..");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No : ");
                    acn = sc.nextInt();
                    found = false;
                    for (int i = 0; i < cust.length; i++)
                    {
                        found = cust[i].search(acn);
                        if (found)
                        {
                            cust[i].withdrawal();
                            break;
                        }
                    }
                    if (!found)
                    {
                        System.out.println("Search Failed..Account Not Exist..");
                    }
                    break;
                case 5:
                    System.out.println("\n Good Bye..");
                    System.out.print("********************************************");
                    break;
                default:
                    System.out.print("\nInvalid Choice: Not available in the option");
                    break;
            }
        } while (opt != 5);
    }
}