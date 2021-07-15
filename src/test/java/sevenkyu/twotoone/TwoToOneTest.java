package sevenkyu.twotoone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoToOneTest {
    TwoToOne twoToOne;

    @BeforeEach
    void init() {
        twoToOne = new TwoToOne();
    }

    @Test
    void longest_shouldConcatInputStrings() {
        // given
        String string = "abc";
        String otherString = "def";
        String expected = "abcdef";

        // when
        String output = twoToOne.longest(string, otherString);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void longest_shouldSortLetters() {
        // given
        String string = "string";
        String otherString = "key";
        String expected = "egiknrsty";

        // when
        String output = twoToOne.longest(string, otherString);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void longest_shouldFilterDuplicates() {
        // given
        String string = "lessdangerousthancoding";
        String otherString = "loopingisfunbutdangerous";
        String expected = "abcdefghilnoprstu";

        // when
        String output = twoToOne.longest(string, otherString);

        // then
        assertThat(output).isEqualTo(expected);
    }
}