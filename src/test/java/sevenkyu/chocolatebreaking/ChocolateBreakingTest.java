package sevenkyu.chocolatebreaking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ChocolateBreakingTest {
    ChocolateBreaking chocolateBreaking;

    @BeforeEach
    void init() {
        chocolateBreaking = new ChocolateBreaking();
    }

    @Test
    void givenOneSquare_breakChocolate_shouldReturn0() {
        // given
        int row = 1;
        int column = 1;
        int expected = 0;

        // when
        int output = chocolateBreaking.breakChocolate(row, column);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void given1x2_breakChocolate_shouldReturnColumnNumberMinusOne() {
        // given
        int row = 1;
        int column = 2;
        int expected = 1;

        // when
        int output = chocolateBreaking.breakChocolate(row, column);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void given1x5_breakChocolate_shouldReturnColumnNumberMinusOne() {
        // given
        int row = 1;
        int column = 5;
        int expected = 4;

        // when
        int output = chocolateBreaking.breakChocolate(row, column);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void given2x2_breakChocolate_shouldReturnMultiplicationMinus1() {
        // given
        int row = 2;
        int column = 2;
        int expected = 3;

        // when
        int output = chocolateBreaking.breakChocolate(row, column);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void given5x5_breakChocolate_shouldReturnMultiplicationMinus1() {
        // given
        int row = 5;
        int column = 5;
        int expected = 24;

        // when
        int output = chocolateBreaking.breakChocolate(row, column);

        // then
        assertThat(output).isEqualTo(expected);
    }
}