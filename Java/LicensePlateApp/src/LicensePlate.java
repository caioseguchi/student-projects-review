//Domain Class LicensePlate
public class LicensePlate {
    //Variables
    private String licenseNumber;
    private boolean valid;

    //Constructor
    public LicensePlate(String licenseNumber, boolean valid) {
        this.licenseNumber = licenseNumber;
        this.valid = valid;
    }

    //Getters and Setter
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    //toString

    @Override
    public String toString() {
        return licenseNumber + " - " + (valid ? "Valid" : "Invalid");
    }
}//class
