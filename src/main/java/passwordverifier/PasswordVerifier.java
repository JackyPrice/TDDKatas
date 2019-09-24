package passwordverifier;

public class PasswordVerifier {

    private static final int MIN_LENGTH = 8;

    public boolean verify(String password) {
        if (password == null) {
            return false;
        }

        if (password.length() > MIN_LENGTH) {
            for (int i = 0; i < password.length(); i++) {
                if (passwordContainsUpperCase(password, i)) return true;
            }
        }
        return false;
    }

    private boolean passwordContainsUpperCase(String password, int i) {
        if (Character.isUpperCase(password.charAt(i))) {
            return true;
        }
        return false;
    }
}
