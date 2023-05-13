import java.util.ArrayList;
import java.util.List;

public class Phone {
    //String for IMEI
    private String IMEI;

    //Boolean power variable
    private boolean powerOn;
    //Array to store phones
    private static List<Phone> phones = new ArrayList<>();

    private Phone(String submittedIMEI) {
        //2 Variables for each instance of phone
        this.IMEI = submittedIMEI;
        this.powerOn = false; // Default power mode is off
    }

    //Method for creating a phone with IMEI
    public static void createPhone(String submittedIMEI) {
        phones.add(new Phone(submittedIMEI));
    }
    //Method to call a specific phone by IMEI
    public static Phone getPhoneByIMEI(String IMEI) {
        for (Phone phone : phones) {
            if (phone.IMEI.equals(IMEI)) {
                return phone;
            }
        }
        return null;
    }
    //Method for toggling power on and off
    public void togglePower() {
        this.powerOn = !this.powerOn;
    }
    //Method to make a phone call as described
    public static void makeCall(String IMEI, String numberToCall) {
        //Iterate over phones
        for (Phone phone : phones) {
            //Check phone power
            if (!phone.powerOn) {
                System.out.println("Phone is off, call failed.");
            } else {
                    //Match phone to IMEI user submitted
                    if (phone.IMEI.equals(IMEI)) {
                        //If user types this specific string, return the IMEI matching the phone
                        if (numberToCall.equals("*#060#")) {
                            //Print IMEI
                            System.out.println("IMEI: " + phone.IMEI);
                            //Check if phone is powered on. If not, fail and print error

                        } else {
                            //Show call success
                            System.out.println("Call initiated to " + numberToCall);
                        }
                        return;
                    } else {
                    }
                }
            }

    }
}