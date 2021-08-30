package sevenkyu.reverseletter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseLetterTest {
    ReverseLetter reverseLetter;

    @BeforeEach
    void init() {
        reverseLetter = new ReverseLetter();
    }

    @Test
    void givenOneCharLongLetter_reverseLetter_shouldReturnLetter() {
        // given
        String input = "a";
        String expected = "a";

        // when
        String output = reverseLetter.reverseLetter(input);

        // then
        assertThat(output).isEqualTo(expected);
    }
}