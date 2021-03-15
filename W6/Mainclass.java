import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mainclass {
    public static void main(String[] args) throws IOException {
        BufferedReader BR = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String acc_nro;
        int amount;
        int limit;
        int sel = 0;
        
        Bank bank = new Bank();

        do {
            System.out.println("\n*** BANK SYSTEM ***");
            System.out.println("1) Add a regular account");
            System.out.println("2) Add a credit account");
            System.out.println("3) Deposit money");
            System.out.println("4) Withdraw money");
            System.out.println("5) Remove an account");
            System.out.println("6) Print account information");
            System.out.println("7) Print all accounts");
            System.out.println("0) Quit");
            System.out.print("Your choice: ");

            sel = Integer.parseInt(BR.readLine().trim());

            switch(sel) {
                case 1:
                    System.out.print("Give an account number: ");
                    acc_nro = BR.readLine();
                    System.out.print("Amount of money to deposit: ");
                    amount = Integer.parseInt(BR.readLine().trim());
                    System.out.print("Account number: ");
                    System.out.println(acc_nro);
                    System.out.print("Amount of money: ");
                    System.out.println(amount);
                    break;
                case 2:
                    System.out.print("Give an account number: ");
                    acc_nro = BR.readLine();
                    System.out.print("Amount of money to deposit: ");
                    amount = Integer.parseInt(BR.readLine().trim());
                    System.out.print("Give a credit limit: ");
                    limit = Integer.parseInt(BR.readLine().trim());
                    System.out.print("Account number: ");
                    System.out.println(acc_nro);
                    System.out.print("Amount of money: ");
                    System.out.println(amount);
                    System.out.print("Credit: ");
                    System.out.println(limit);
                    break;
                case 3:
                    System.out.print("Give an account number: ");
                    acc_nro = BR.readLine();
                    System.out.print("Amount of money to deposit: ");
                    amount = Integer.parseInt(BR.readLine().trim());
                    System.out.print("Account number: ");
                    System.out.println(acc_nro);
                    System.out.print("Amount of money: ");
                    System.out.println(amount);
                    break;
                case 4:
                    System.out.print("Give an account number: ");
                    acc_nro = BR.readLine();
                    System.out.print("Amount of money to withdraw: ");
                    amount = Integer.parseInt(BR.readLine().trim());
                    System.out.print("Account number: ");
                    System.out.println(acc_nro);
                    System.out.print("Amount of money: ");
                    System.out.println(amount);
                    break;
                case 5:
                    System.out.print("Give the account number of the account to delete: ");
                    acc_nro = BR.readLine();
                    bank.removeAccount(acc_nro);
                    break;
                case 6:
                    System.out.print("Give the account number of the account to print information from: ");
                    acc_nro = BR.readLine();
                    System.out.print("Account number: ");
                    System.out.println(acc_nro);
                    break;
                case 7:
                    System.out.println("All accounts: ");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (sel != 0);
    }
}
