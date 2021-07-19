package sevenkyu.sumofoddnumbers;

import java.util.HashMap;
import java.util.Map;

class SumOfOddNumbers {
    static final int FIRST_ODD_NUMBER = 1;
    static final Map<Integer, Integer> ROWS = new HashMap<>();

    static {
        ROWS.put(1, 1);
    }

    public int rowSumOddNumbers(int n) {
        int lastNumber = FIRST_ODD_NUMBER;
        int sum;
        for (int rowNumber = 2; rowNumber <= n; rowNumber++) {
            sum = 0;
            for (int rowIterator = 0; rowIterator < rowNumber; rowIterator++) {
                lastNumber += 2;
                sum += lastNumber;
            }
            ROWS.put(rowNumber, sum);
        }
        return ROWS.get(n);
    }
}
