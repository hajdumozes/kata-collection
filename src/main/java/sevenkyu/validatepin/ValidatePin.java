package sevenkyu.validatepin;

import java.util.List;

class ValidatePin {
    static final List<Integer> ALLOWED_LENGTHS = List.of(4, 6);

    public boolean validatePin(String pin) {
        return ALLOWED_LENGTHS.contains(pin.length());
    }
}
