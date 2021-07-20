package sevenkyu.printererror;

class PrinterError {
    static final Character SEPARATOR = '/';
    static final String VALID_PATTERN = "[a-m]*";

    public String printerError(String s) {
        String invalidChars = s.replaceAll(VALID_PATTERN, "");
        return "" + invalidChars.length() + SEPARATOR + s.length();
    }
}
