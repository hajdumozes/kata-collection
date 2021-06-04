package sevenkyu.oddoreven;

import java.util.Arrays;

class OddOrEven {
    static final String ODD = "odd";
    static final String EVEN = "even";

    /**
     * @param array: numbers to sum
     * @return "odd"/"even" depending on the sum of the number array
     */
    public String oddOrEven(int[] array) {
        return Arrays.stream(array).sum() % 2 == 0 ? EVEN : ODD;
    }
}
