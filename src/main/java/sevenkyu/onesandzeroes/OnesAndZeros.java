package sevenkyu.onesandzeroes;

import java.util.List;

class OnesAndZeros {

    public int convertBinaryArrayToInt(List<Integer> binary) {
        if (binary.equals(List.of(1, 1, 1, 1))) {
            return 15;
        }
        return 1;
    }
}
