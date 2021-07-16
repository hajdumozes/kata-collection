package sevenkyu.sumofoddnumbers;

import java.util.HashMap;
import java.util.Map;

class SumOfOddNumbers {

    public int rowSumOddNumbers(int n) {
        int firstOddNumber = 1;
        Map<Integer, Integer> rows = new HashMap<>();
        rows.put(1, firstOddNumber);
        int lastNumber = firstOddNumber;
        int sum;
        for (int i = 2; i <= n; i++) {
            sum = 0;
            for (int k = 0; k < i; k++) {
                lastNumber += 2;
                sum += lastNumber;
            }
            rows.put(i, sum);
        }
        return rows.get(n);
    }
}
