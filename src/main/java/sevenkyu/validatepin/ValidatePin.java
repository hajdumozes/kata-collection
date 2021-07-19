package sevenkyu.validatepin;

class ValidatePin {

    public boolean validatePin(String pin) {
        if (pin.length() == 4 || pin.length() == 6) {
            return true;
        }
        return false;
    }
}
