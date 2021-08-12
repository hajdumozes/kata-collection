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
}