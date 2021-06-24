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

}