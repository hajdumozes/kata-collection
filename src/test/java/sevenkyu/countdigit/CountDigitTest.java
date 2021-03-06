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

    @Test
    void givenSquareTopIs1DigitIs0_nbDig_shouldReturn1() {
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
    void givenSquareTopIs1DigitIs1_nbDig_shouldReturn1() {
        // given
        int squareTop = 1;
        int digit = 1;
        int expected = 1;

        // when
        int output = countDigit.nbDig(squareTop, digit);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenSquareTopIs1DigitIs2_nbDig_shouldReturn0() {
        // given
        int squareTop = 1;
        int digit = 2;
        int expected = 0;

        // when
        int output = countDigit.nbDig(squareTop, digit);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenSquareTopIs10DigitIs1_nbDig_shouldReturn4() {
        // given
        int squareTop = 10;
        int digit = 1;
        int expected = 4;

        // when
        int output = countDigit.nbDig(squareTop, digit);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenSquareTopIs10DigitIs9_nbDig_shouldReturn3() {
        // given
        int squareTop = 10;
        int digit = 9;
        int expected = 2;

        // when
        int output = countDigit.nbDig(squareTop, digit);

        // then
        assertThat(output).isEqualTo(expected);
    }
}