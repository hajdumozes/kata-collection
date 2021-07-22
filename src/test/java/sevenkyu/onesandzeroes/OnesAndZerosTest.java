package sevenkyu.onesandzeroes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class OnesAndZerosTest {
    OnesAndZeros onesAndZeros;

    @BeforeEach
    void init() {
        onesAndZeros = new OnesAndZeros();
    }

    @Test
    void given0001_convertBinaryArrayToInt_shouldReturn1() {
        // given
        List<Integer> input = List.of(0, 0, 0, 1);
        int expected = 1;

        // when
        int output = onesAndZeros.convertBinaryArrayToInt(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void given1111_convertBinaryArrayToInt_shouldReturn15() {
        // given
        List<Integer> input = List.of(1, 1, 1, 1);
        int expected = 15;

        // when
        int output = onesAndZeros.convertBinaryArrayToInt(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void given0110_convertBinaryArrayToInt_shouldReturn6() {
        // given
        List<Integer> input = List.of(0, 1, 1, 0);
        int expected = 6;

        // when
        int output = onesAndZeros.convertBinaryArrayToInt(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void given1001_convertBinaryArrayToInt_shouldReturn9() {
        // given
        List<Integer> input = List.of(1, 0, 0, 1);
        int expected = 9;

        // when
        int output = onesAndZeros.convertBinaryArrayToInt(input);

        // then
        assertThat(output).isEqualTo(expected);
    }
}