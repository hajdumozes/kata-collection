package sevenkyu.luckynumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LuckyNumberTest {
    LuckyNumber luckyNumber;

    @BeforeEach
    public void init() {
        luckyNumber = new LuckyNumber();
    }

    @Test
    public void givenSumOfDigitsIsZero_isLucky_shouldBeTrue() {
        // Given
        long number = 0;
        // When
        boolean lucky = luckyNumber.isLucky(number);
        // Then
        assertThat(lucky).isTrue();
    }

    @Test
    public void givenSumOfDigitsCanBeDividedBy9WithoutRemainder_isLucky_shouldBeTrue() {
        // Given
        long number = 1892376;
        // When
        boolean lucky = luckyNumber.isLucky(number);
        // Then
        assertThat(lucky).isTrue();
    }

    @Test
    public void givenSumOfDigitsCanNotBeDividedBy9WithoutRemainder_isLucky_shouldBeFalse() {
        // Given
        long number = 189237;
        // When
        boolean lucky = luckyNumber.isLucky(number);
        // Then
        assertThat(lucky).isFalse();
    }

}