import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accList = new ArrayList();
    public Bank() {

    }

    public void removeAccount(String acc_nro) {
        int i = 0;
        for (Account a : accList)  {
            if (a.getAccount_number().equals(accountNumber)) {
                accList.remove(i);
                System.out.println("Account removed");
                break;
            }
            i++;
        }
    }

    
    public void addBalance(String accountNumber, int money) {
        System.out.print("Amount of money to deposit: ");
        System.out.println(accountNumber + " the amount " + money);
    }
    
    public void decreaseBalance(String accountNumber, int money) {
        System.out.print("Amount of money to withdraw: ");
        System.out.println(accountNumber + " the amount " + money);
    }
    
    public void searchAccount(String accountNumber) {
        for (Account a : accList) {
                System.out.print("Give the account number of the account to print information from: " + accountNumber);
                System.out.println("Searching for account: " + accountNumber;
            }
        }
    }
}
