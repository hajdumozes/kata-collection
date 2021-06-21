package sevenkyu.minmax;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

class MinMax {
    private static final String SEPARATOR = " ";

    public String highAndLow(String numbers) {
        IntSummaryStatistics intSummaryStatistics = Arrays.stream(numbers.split(""))
            .mapToInt(Integer::valueOf)
            .summaryStatistics();
        return intSummaryStatistics.getMax() + SEPARATOR + intSummaryStatistics.getMin();
    }
}
