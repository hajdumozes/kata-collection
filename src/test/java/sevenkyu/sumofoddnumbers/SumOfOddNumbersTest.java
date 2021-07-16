package sevenkyu.sumofoddnumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumOfOddNumbersTest {
    SumOfOddNumbers sumOfOddNumbers;

    @BeforeEach
    void init() {
        sumOfOddNumbers = new SumOfOddNumbers();
    }

    @Test
    void givenInputIs1_rowSumOfOddNumbers_shouldReturnWith1() {
        // given
        int input = 1;

        // when
        int output = sumOfOddNumbers.rowSumOddNumbers(input);

        // then
        assertThat(output).isEqualTo(input);
    }

    @Test
    void rowSumOfOddNumbers_shouldReturnWithSumOfInputRowInOddTriangle() {
        // given
        int input = 2;
        int expected = 8;

        // when
        int output = sumOfOddNumbers.rowSumOddNumbers(input);

        // then
        assertThat(output).isEqualTo(expected);
    }
}