public class Test {
    public static void main(String[] args) {
        // Create phones
        Phone.createPhone("123456789012345");
        Phone.createPhone("987654321098765");

        // Power on the first phone by calling the Phone class and getting the phone by IMEI
        Phone firstPhone = Phone.getPhoneByIMEI("123456789012345");
        if (firstPhone != null) {
            firstPhone.togglePower();
        }
        // Make calls
        Phone.makeCall("123456789012345", "*#060#");
        Phone.makeCall("123456789012345", "2024561414");
        Phone.makeCall("987654321098765", "2024561414");
    }
}