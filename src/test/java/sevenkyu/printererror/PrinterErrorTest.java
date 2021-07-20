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
}