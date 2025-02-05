import javax.swing.*;
import java.util.InputMismatchException;


public class ItemCheckerApp {
    public static void main(String[] args) {
        //Declare Variables
        int option =0;
        String licenseNumber;
        int numberOfLicencePlates;

        //Constructor
        ItemChecker ic = new ItemChecker();


        //Menu
        do {
            try {
                //input
                option = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu" +
                                "\n 1) Verify licence plate" +
                                "\n 2) Verify Twitter username" +
                                "\n 3) Exit the App"));

                //Process and Output
                switch (option) {
                    case 1:
                        ic.verifyLicensePlates();
                        break;
                    case 2:
                        System.out.println("Option 2");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Exiting the app");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option");
                }//switch

            //Error handle
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid option choose a option between 1 and 3");
            } //catch

        }while (option != 3);
    }//main
}//class
