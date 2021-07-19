package sevenkyu.validatepin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidatePinTest {

    ValidatePin validatePin;

    @BeforeEach
    void init () {
        validatePin = new ValidatePin();
    }

    @Test
    void givenInputLengthIs1CharLong_validatePin_shouldReturnFalse() {
        // given
        String input = "1";

        // when
        boolean output = validatePin.validatePin(input);

        // then
        assertThat(output).isFalse();
    }
}