package sevenkyu.money;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {
    Money money;

    @BeforeEach
    void init() {
        money = new Money();
    }

    @Test
    void givenPrincipalIsSmallerThanDesired_calculateYears_shouldReturnWithZero() {
        // given
        int principal = 1000;
        double interest = 0.10;
        double tax = 0;
        int desired = 1000;
        int expectedYears = 0;

        // when
        int output = money.calculateYears(principal, interest, tax, desired);

        // then
        assertThat(output).isEqualTo(expectedYears);
    }
}