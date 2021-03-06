package sevenkyu.printererror;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrinterErrorTest {
    PrinterError printerError;

    @BeforeEach
    void init() {
        printerError = new PrinterError();
    }

    @Test
    void givenEmptyString_printerError_shouldPrintZeroOutOfZero() {
        // given
        String input = "";
        String expected = "0/0";

        // when
        String output = printerError.printerError(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenOneCharString_printerError_shouldPrintZeroOutOfOne() {
        // given
        String input = "a";
        String expected = "0/1";

        // when
        String output = printerError.printerError(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenErrorlessString_printerError_shouldPrintZeroOutOfLength() {
        // given
        String input = "aaaaaaabbbbbbbb";
        String expected = "0/15";

        // when
        String output = printerError.printerError(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenOneErrorPresent_printerError_shouldPrintOneOutOfLength() {
        // given
        String input = "aaaaxaabbbbbbbb";
        String expected = "1/15";

        // when
        String output = printerError.printerError(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenErrorsPresent_printerError_shouldPrintErrorAmountOutOfLength() {
        // given
        String input = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        String expected = "3/56";

        // when
        String output = printerError.printerError(input);

        // then
        assertThat(output).isEqualTo(expected);
    }
}