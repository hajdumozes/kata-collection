package sevenkyu.countdivisior;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountDivisorTest {
    CountDivisor countDivisor;

    @BeforeEach
    void init() {
        countDivisor = new CountDivisor();
    }

    @Test
    void givenInputIs1_numberOfDivisors_shouldReturn1() {
        // given
        int input = 1;
        int expected = 1;

        // when
        long output = countDivisor.numberOfDivisors(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenInputIs2_numberOfDivisors_shouldReturn2() {
        // given
        int input = 2;
        int expected = 2;

        // when
        long output = countDivisor.numberOfDivisors(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenInputIs4_numberOfDivisors_shouldReturn3() {
        // given
        int input = 4;
        int expected = 3;

        // when
        long output = countDivisor.numberOfDivisors(input);

        // then
        assertThat(output).isEqualTo(expected);
    }
}