public class Validator {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^\\d{2}-0\\d{9}$");
    }
}
