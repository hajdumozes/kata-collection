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

}