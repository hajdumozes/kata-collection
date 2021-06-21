package sevenkyu.minmax;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinMaxTest {
    MinMax minMax;

    @BeforeEach
    public void init() {
        minMax = new MinMax();
    }

    @Test
    public void highAndLow_shouldReturnMaxThenMinInSingleSeparatedString() {
        // Given
        String input = "12345";
        // When
        String output = minMax.highAndLow(input);
        // Then
        assertThat(output).isEqualTo("5 1");
    }

}