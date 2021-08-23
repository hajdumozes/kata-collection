package sevenkyu.maxlengthdiff;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

class MaxLengthDiff {

    public int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }
        IntSummaryStatistics summary = Stream.concat(Arrays.stream(a1), Arrays.stream(a2))
            .mapToInt(String::length)
            .summaryStatistics();
        return summary.getMax() - summary.getMin();
    }
}
