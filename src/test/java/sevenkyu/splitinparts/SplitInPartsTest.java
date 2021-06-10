package sevenkyu.splitinparts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SplitInPartsTest {
    SplitInParts splitInParts;

    @BeforeEach
    public void init() {
        splitInParts = new SplitInParts();
    }

    @Test
    public void givenPartIsLongerThanString_splitInParts_shouldNotSplit() {
        // Given
        String string = "HelloKata";
        int partLength = 9;
        // When
        String result = splitInParts.splitInParts(string, partLength);
        // Then
        assertThat(result).isEqualTo(string);
    }

    @Test
    public void givenStringLengthIsAMultipleOFPartLength_splitInParts_shouldSplitEqually() {
        // Given
        String string = "HelloKata";
        int partLength = 3;
        // When
        String result = splitInParts.splitInParts(string, partLength);
        // Then
        assertThat(result).isEqualTo("Hel loK ata");
    }

    @Test
    public void givenStringLengthIsNotAMultipleOFPartLength_splitInParts_shouldHaveTheLastPartShorter() {
        // Given
        String string = "HelloKata";
        int partLength = 2;
        // When
        String result = splitInParts.splitInParts(string, partLength);
        // Then
        assertThat(result).isEqualTo("He ll oK at a");
    }

}