package sevenkyu.printererror;

class PrinterError {
    static final Character SEPARATOR = '/';

    public String printerError(String s) {
        return "0" + SEPARATOR + s.length();
    }
}
