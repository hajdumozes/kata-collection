package sevenkyu.validatepin;

import java.util.regex.Pattern;

class ValidatePin {
    static final Pattern PATTERN = Pattern.compile("\\d{4}|\\d{6}");

    public boolean validatePin(String pin) {
        return PATTERN.matcher(pin).matches();
    }
}
