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
    void givenOneCharLongWord_reverseLetter_shouldReturnLetter() {
        // given
        String input = "a";
        String expected = "a";

        // when
        String output = reverseLetter.reverseLetter(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenMultipleCharLongWord_reverseLetter_shouldReverseWord() {
        // given
        String input = "abc";
        String expected = "cba";

        // when
        String output = reverseLetter.reverseLetter(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenMultipleCharLongWordWithNonAlphabeticChars_reverseLetter_shouldReverseWordAndCutNonAlphabetic() {
        // given
        String input = "ab45c";
        String expected = "cba";

        // when
        String output = reverseLetter.reverseLetter(input);

        // then
        assertThat(output).isEqualTo(expected);
    }
}