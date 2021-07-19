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

    @Test
    void givenInputLengthIs4CharsLong_validatePin_shouldReturnTrue() {
        // given
        String input = "1234";

        // when
        boolean output = validatePin.validatePin(input);

        // then
        assertThat(output).isTrue();
    }

    @Test
    void givenInputLengthIs5CharsLong_validatePin_shouldReturnFalse() {
        // given
        String input = "12341";

        // when
        boolean output = validatePin.validatePin(input);

        // then
        assertThat(output).isFalse();
    }

    @Test
    void givenInputLengthIs6CharsLong_validatePin_shouldReturnTrue() {
        // given
        String input = "123412";

        // when
        boolean output = validatePin.validatePin(input);

        // then
        assertThat(output).isTrue();
    }

    @Test
    void givenInputLengthIs7CharsLong_validatePin_shouldReturnFalse() {
        // given
        String input = "1234124";

        // when
        boolean output = validatePin.validatePin(input);

        // then
        assertThat(output).isFalse();
    }

    @Test
    void givenInputHasALetter_validatePin_shouldReturnFalse() {
        // given
        String input = "123a";

        // when
        boolean output = validatePin.validatePin(input);

        // then
        assertThat(output).isFalse();
    }
}