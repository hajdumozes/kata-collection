package sevenkyu.linenumbering;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LineNumberingTest {
    LineNumbering lineNumbering;

    @BeforeEach
    void init() {
        lineNumbering = new LineNumbering();
    }

    @Test
    void givenOneChar_number_shouldReturnFirstLineAndChar() {
        // given
        List<String> input = List.of("a");
        List<String> expected = List.of("1: a");

        // when
        List<String> output = lineNumbering.number(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenEmptyString_number_shouldReturnFirstLineAndEmptyString() {
        // given
        List<String> input = List.of("");
        List<String> expected = List.of("1: ");

        // when
        List<String> output = lineNumbering.number(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenTwoElementInput_number_shouldReturnTwoLinesInOrder() {
        // given
        List<String> input = List.of("c", "d");
        List<String> expected = List.of("1: c", "2: d");

        // when
        List<String> output = lineNumbering.number(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenMultiElementInput_number_shouldReturnLinesInOrder() {
        // given
        List<String> input = List.of("k", "i", "t", "t", "y");
        List<String> expected = List.of("1: k", "2: i", "3: t", "4: t", "5: y");

        // when
        List<String> output = lineNumbering.number(input);

        // then
        assertThat(output).isEqualTo(expected);
    }
}