public class Test {
    public static void main(String[] args) {
        // Create phones
        Phone.createPhone("358844102814380");
        Phone.createPhone("352233097803515");

        // Power on the first phone by calling the Phone class and getting the phone by IMEI
        Phone firstPhone = Phone.getPhoneByIMEI("358844102814380");
        Phone secondPhone = Phone.getPhoneByIMEI("352233097803515");
            firstPhone.togglePower();

        // Make calls
        Phone.makeCall("358844102814380", "8675309");
        Phone.makeCall("352233097803515", "2024561414");
        secondPhone.togglePower();
        Phone.makeCall("352233097803515", "2024561414");
        Phone.makeCall("352233097803515", "*#060#");
    }
}