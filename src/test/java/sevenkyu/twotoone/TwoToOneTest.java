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
        String string = "string";
        String otherString = "key";
        String expected = "stringkey";

        // when
        String output = twoToOne.longest(string, otherString);

        // then
        assertThat(output).isEqualTo(expected);
    }
}