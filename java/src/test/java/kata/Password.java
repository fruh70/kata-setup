package kata;

import java.util.regex.Pattern;

public class Password {


    public boolean isValidRule1(String password) {
        return (password.length() >= 6);
    }

    public boolean isValidRule2(String password) {
        /* at least one number */
        return (Pattern.matches(".*[0-9]+.*", password));
    }

    public boolean isValidRule3(String password) {
        /* at least one letter */
        return Pattern.matches(".*[a-zA-Z]+.*", password);
    }

    public boolean isStrong(String password) {
        return isValidRule1(password) && isValidRule2(password) && isValidRule3(password);
    }
}
