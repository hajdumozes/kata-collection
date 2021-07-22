package sevenkyu.onesandzeroes;

import java.util.List;
import java.util.stream.Collectors;

class OnesAndZeros {

    public int convertBinaryArrayToInt(List<Integer> binary) {
        String binaryString = binary.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
        return Integer.parseInt(binaryString, 2);
    }
}
