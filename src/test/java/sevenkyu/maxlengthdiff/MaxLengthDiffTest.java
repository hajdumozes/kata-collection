package sevenkyu.maxlengthdiff;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxLengthDiffTest {
    MaxLengthDiff maxLengthDiff;

    @BeforeEach
    void init() {
        maxLengthDiff = new MaxLengthDiff();
    }

    @Test
    void givenA1IsEmpty_mxdiflg_shouldReturnMinusOne() {
        // given
        String[] a1 = new String[]{};
        String[] a2 = new String[]{"a"};
        int expected = -1;

        // when
        int output = maxLengthDiff.mxdiflg(a1, a2);

        // then
        assertThat(output).isEqualTo(expected);
    }
}