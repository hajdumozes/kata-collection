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

    @Test
    void givenA2IsEmpty_mxdiflg_shouldReturnMinusOne() {
        // given
        String[] a1 = new String[]{"a"};
        String[] a2 = new String[]{};
        int expected = -1;

        // when
        int output = maxLengthDiff.mxdiflg(a1, a2);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenOneElementEqualLength_mxdiflg_shouldReturnZero() {
        // given
        String[] a1 = new String[]{"a"};
        String[] a2 = new String[]{"b"};
        int expected = 0;

        // when
        int output = maxLengthDiff.mxdiflg(a1, a2);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenOneElementA1IsLonger_mxdiflg_shouldReturnPositiveDiffNumber() {
        // given
        String[] a1 = new String[]{"ab"};
        String[] a2 = new String[]{"b"};
        int expected = 1;

        // when
        int output = maxLengthDiff.mxdiflg(a1, a2);

        // then
        assertThat(output).isEqualTo(expected);
    }
}