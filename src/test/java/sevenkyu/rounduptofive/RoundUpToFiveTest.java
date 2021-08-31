package sevenkyu.rounduptofive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoundUpToFiveTest {
    RoundUpToFive roundUpToFive;

    @BeforeEach
    void init() {
        roundUpToFive = new RoundUpToFive();
    }

    @Test
    void given0_roundToNext5_shouldReturn0() {
        // given
        int input = 0;
        int expected = 0;

        // when
        int output = roundUpToFive.roundToNext5(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void given5_roundToNext5_shouldReturn5() {
        // given
        int input = 5;
        int expected = 5;

        // when
        int output = roundUpToFive.roundToNext5(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void given1_roundToNext5_shouldReturn5() {
        // given
        int input = 1;
        int expected = 5;

        // when
        int output = roundUpToFive.roundToNext5(input);

        // then
        assertThat(output).isEqualTo(expected);
    }
}