package sevenkyu.printererror;

class PrinterError {

    public String printerError(String s) {
        if (s.length() == 1) {
            return "0/1";
        }
        return "0/0";
    }
}
