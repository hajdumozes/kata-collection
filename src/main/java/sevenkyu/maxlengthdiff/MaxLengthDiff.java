package sevenkyu.maxlengthdiff;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

class MaxLengthDiff {

    public int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }
        IntSummaryStatistics firstSummary = Arrays.stream(a1)
            .mapToInt(String::length)
            .summaryStatistics();
        IntSummaryStatistics secondSummary = Arrays.stream(a2)
            .mapToInt(String::length)
            .summaryStatistics();
        return Math.max(firstSummary.getMax() - secondSummary.getMin(), secondSummary.getMax() - firstSummary.getMin());
    }
}
