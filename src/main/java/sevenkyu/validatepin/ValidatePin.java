package sevenkyu.validatepin;

class ValidatePin {
    static final String PATTERN = "\\d{4}|\\d{6}";

    public boolean validatePin(String pin) {
        return pin.matches(PATTERN);
    }
}
