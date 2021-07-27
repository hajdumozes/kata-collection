package sevenkyu.reversewords;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseWordsTest {
    ReverseWords reverseWords;

    @BeforeEach
    void init() {
        reverseWords = new ReverseWords();
    }

    @Test
    void givenCharacter_reverse_shouldReturnItself() {
        // given
        String input = "o";
        String expected = "o";

        // when
        String output = reverseWords.reverse(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenWord_reverse_shouldReturnWordInReverse() {
        // given
        String input = "test";
        String expected = "tset";

        // when
        String output = reverseWords.reverse(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenWord_reverse_shouldRetainCases() {
        // given
        String input = "Maybe";
        String expected = "ebyaM";

        // when
        String output = reverseWords.reverse(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenMultipleWords_reverse_shouldReverseAllInOrder() {
        // given
        String input = "This is an example!";
        String expected = "sihT si na !elpmaxe";

        // when
        String output = reverseWords.reverse(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenMultipleWords_reverse_shouldKeepSpaces() {
        // given
        String input = "double  spaces";
        String expected = "elbuod  secaps";

        // when
        String output = reverseWords.reverse(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenEmptySpaces_reverse_shouldKeepSpaces() {
        // given
        String input = "  ";
        String expected = "  ";

        // when
        String output = reverseWords.reverse(input);

        // then
        assertThat(output).isEqualTo(expected);
    }
}