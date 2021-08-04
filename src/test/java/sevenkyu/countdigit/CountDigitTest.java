package sevenkyu.countdigit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountDigitTest {
    CountDigit countDigit;

    @BeforeEach
    void init() {
        countDigit = new CountDigit();
    }

    @Test
    void givenSquareTopIs0DigitIs0_nbDig_shouldReturn1() {
        // given
        int squareTop = 0;
        int digit = 0;
        int expected = 1;

        // when
        int output = countDigit.nbDig(squareTop, digit);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenSquareTopIs0DigitIs1_nbDig_shouldReturn0() {
        // given
        int squareTop = 0;
        int digit = 1;
        int expected = 0;

        // when
        int output = countDigit.nbDig(squareTop, digit);

        // then
        assertThat(output).isEqualTo(expected);
    }
}