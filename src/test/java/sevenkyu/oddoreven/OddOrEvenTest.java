package sevenkyu.oddoreven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class OddOrEvenTest {
    OddOrEven oddOrEven;

    @BeforeEach
    public void init() {
        oddOrEven = new OddOrEven();
    }

    @Test
    public void givenSumIsOdd_oddOrEven_shouldReturnWithOdd() {
        // Given
        // When
        String oddity = oddOrEven.oddOrEven(new int[]{2, 5, 34, 6});
        // Then
        assertThat(oddity).isEqualTo(OddOrEven.ODD);
    }

    @Test
    public void givenSumIsEven_oddOrEven_shouldReturnWithEven() {
        // Given
        // When
        String oddity = oddOrEven.oddOrEven(new int[]{2, 8, 34, 6});
        // Then
        assertThat(oddity).isEqualTo(OddOrEven.EVEN);
    }

    @Test
    public void givenSumIsZero_oddOrEven_shouldReturnWithEven() {
        // Given
        // When
        String oddity = oddOrEven.oddOrEven(new int[]{});
        // Then
        assertThat(oddity).isEqualTo(OddOrEven.EVEN);
    }
}