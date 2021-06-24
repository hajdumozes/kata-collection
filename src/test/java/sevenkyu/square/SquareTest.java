package sevenkyu.square;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {
    Square square;

    @BeforeEach
    void init() {
        square = new Square();
    }

    @Test
    void givenZero_isSquare_shouldReturnTrue() {
        // given
        int input = 0;
        // when
        boolean square = this.square.isSquare(input);
        // then
        assertThat(square).isTrue();
    }

    @Test
    void givenNegativeNumber_isSquare_shouldReturnFalse() {
        // given
        int input = -1;
        // when
        boolean square = this.square.isSquare(input);
        // then
        assertThat(square).isFalse();
    }

    @Test
    void givenPositiveSquareNumber_isSquare_shouldReturnTrue() {
        // given
        int input = 25;
        // when
        boolean square = this.square.isSquare(input);
        // then
        assertThat(square).isTrue();
    }

    @Test
    void givenPositiveNonSquareNumber_isSquare_shouldReturnFalse() {
        // given
        int input = 26;
        // when
        boolean square = this.square.isSquare(input);
        // then
        assertThat(square).isFalse();
    }
}