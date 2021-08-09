package sevenkyu.minmaxprofit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinMaxProfitTest {
    MinMaxProfit minMaxProfit;

    @BeforeEach
    void init() {
        minMaxProfit = new MinMaxProfit();
    }

    @Test
    void givenOneLengthArray_minMax_shouldReturnNumberTwice() {
        // given
        int[] input = new int[]{1};
        int[] expected = new int[]{1, 1};

        // when
        int[] output = minMaxProfit.minMax(input);

        // then
        assertThat(output).isEqualTo(expected);
    }
}