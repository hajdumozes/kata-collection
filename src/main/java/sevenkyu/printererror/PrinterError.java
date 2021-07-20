package sevenkyu.printererror;

class PrinterError {
    static final Character SEPARATOR = '/';

    public String printerError(String s) {
        if (s.contains("x")) {
            return "1" + SEPARATOR + s.length();
        }
        return "0" + SEPARATOR + s.length();
    }
}
