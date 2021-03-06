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
        long expected = -1;

        // when
        long output = perfectSquare.findNextSquare(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenInputIs1_findNextSquare_shouldReturnWith4() {
        // given
        long input = 1;
        long expected = 4;

        // when
        long output = perfectSquare.findNextSquare(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenInputIs121_findNextSquare_shouldReturnWith144() {
        // given
        long input = 121;
        long expected = 144;

        // when
        long output = perfectSquare.findNextSquare(input);

        // then
        assertThat(output).isEqualTo(expected);
    }
    @Test
    void givenInputIs625_findNextSquare_shouldReturnWith676() {
        // given
        long input = 625;
        long expected = 676;

        // when
        long output = perfectSquare.findNextSquare(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

}