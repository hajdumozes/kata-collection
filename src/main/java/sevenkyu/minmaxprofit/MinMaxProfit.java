package sevenkyu.minmaxprofit;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

class MinMaxProfit {

    public int[] minMax(int[] arr) {
        IntSummaryStatistics intSummaryStatistics = Arrays.stream(arr)
            .summaryStatistics();
        return new int[]{intSummaryStatistics.getMin(), intSummaryStatistics.getMax()};
    }
}
