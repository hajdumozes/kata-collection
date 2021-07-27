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
}