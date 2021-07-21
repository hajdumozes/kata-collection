package sevenkyu.perfectsquare;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PerfectSquareTest {
    PerfectSquare perfectSquare;

    @BeforeEach
    void init() {
        perfectSquare = new PerfectSquare();
    }

    @Test
    void givenInputIsNotSquare_findNextSquare_shouldReturnWithMinusOne() {
        // given
        long input = 2;

        // when
        long output = perfectSquare.findNextSquare(input);

        // then
        assertThat(output).isEqualTo(input);
    }
}