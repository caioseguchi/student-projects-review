import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemChecker {
    //Declare Variable
    private static final String pattern = "^[0-9]{3}-[A-Za-z]{2}-[0-9]{4,6}$";
    private int numberOfLicencePlates;


    //Declare Array of objects
    LicensePlate[] licensePlates = new LicensePlate[10];

    //Option 1 Method to verify license plates
    public void verifyLicensePlates(){
        //Input - number of licenses


        while (true){
            try {
                numberOfLicencePlates = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of licenses to verify, max 10"));
                //Check if the array is full
                if (numberOfLicencePlates > licensePlates.length){
                    JOptionPane.showMessageDialog(null, "You reach the max of license plates");
                    return;
                }

                //Input - Enter License Plates
                for (int i = 0; i < numberOfLicencePlates; i++) {
                    String licenseNumber = JOptionPane.showInputDialog(null, "Enter the license plate "+(i+1)).toUpperCase();

                    //Verify if it is valid
                    boolean isValid = isValidLicensePlate(licenseNumber);

                    //Save to array
                    licensePlates[i] = new LicensePlate(licenseNumber, isValid);
                }//for
                //Display results
                displayResults();
                break;

            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Enter a number between 1 and 10");
            }//catch
        }//while
    }//verifyLicensePlates

    // Method to validate license plate using regex
    private boolean isValidLicensePlate(String licensePlate) {
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(licensePlate);
        return matcher.matches();
    }//isValidLicensePlate

    // Method to display results
    public void displayResults() {
        StringBuilder result = new StringBuilder("License Plate Validation Results:\n");
        for (int i = 0; i < numberOfLicencePlates; i++) {
            result.append(licensePlates[i].toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, result.toString());
    }
}//class
