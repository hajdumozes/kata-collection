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
}