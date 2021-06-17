package sevenkyu.mumbling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MumblingTest {
    Mumbling mumbling;

    @BeforeEach
    public void init() {
        mumbling = new Mumbling();
    }

    @Test
    public void accum_shouldCapitalizeFirstLetterOfEachSequence() {
        // Given
        String string = "a";
        // When
        String accum = mumbling.accum(string);
        // Then
        assertThat(accum).isEqualTo("A");
    }

    @Test
    public void accum_shouldSeparateSequencesWithDash() {
        // Given
        String string = "ab";
        // When
        String accum = mumbling.accum(string);
        // Then
        assertThat(accum).isEqualTo("A-B");
    }

    @Test
    public void accum_lettersShouldBeRepeatedEqualToTheirIndexPlusOne() {
        // Given
        String string = "ZpglnRxqenU";
        // When
        String accum = mumbling.accum(string);
        // Then
        assertThat(accum).isEqualTo("Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
    }
}