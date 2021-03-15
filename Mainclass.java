import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mainclass {
    public static void main(String[] args) {

        BottleDispenser bottledispenser = BottleDispenser.getInstance();
        
        BufferedReader bottlereader = new BufferedReader(
            new InputStreamReader(System.in)
        );
        int valinta = 0;
        
        do {
            System.out.print(   "\n*** BOTTLE DISPENSER ***\n" +
                                "1) Add money to the machine\n" +
                                "2) Buy a bottle\n" +
                                "3) Take money out\n" +
                                "4) List bottles in the dispenser\n" +
                                "0) End\n" +
                                "Your choice: ");
            try {
                valinta = Integer.parseInt(bottlereader.readLine().trim());
            } catch (IOException ex) {
                Logger.getLogger(Mainclass.class.getName()).log(Level.SEVERE, null, ex);
            }
            switch(valinta) {
                case 1:
                    bottledispenser.addMoney();
                    break;
                case 2:
                    bottledispenser.listBottles();
                    System.out.print("Your choice: ");
                try {
                    valinta = Integer.parseInt(bottlereader.readLine().trim());
                } catch (IOException ex) {
                    Logger.getLogger(Mainclass.class.getName()).log(Level.SEVERE, null, ex);
                }
                    bottledispenser.buyBottle(valinta);
                    break;
                case 3:
                    bottledispenser.returnMoney();
                    break;
                case 4:
                    bottledispenser.listBottles();
                    break;
                default:
                    break;
            }
        } while (valinta != 0);
    }
}