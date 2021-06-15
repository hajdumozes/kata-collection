package sevenkyu.cryptanalysis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CryptanalysisTest {
    Cryptanalysis cryptanalysis;

    @BeforeEach
    public void init() {
        cryptanalysis = new Cryptanalysis();
    }

    @Test
    public void whenThereIsNoLetterReoccurrence_wordPattern_shouldConsistOfAscendingNumbers() {
        // Given
        String word = "word";
        // When
        String result = cryptanalysis.wordPattern(word);
        // Then
        assertThat(result).isEqualTo("0.1.2.3");
    }

    @Test
    public void whenThereIsLetterReoccurrence_wordPattern_shouldUseTheSameNumberForIdenticalLetters() {
        // Given
        String word = "hello";
        // When
        String result = cryptanalysis.wordPattern(word);
        // Then
        assertThat(result).isEqualTo("0.1.2.2.3");
    }

    @Test
    public void wordPattern_shouldBeCaseInsensitive() {
        // Given
        String word = "heLlo";
        // When
        String result = cryptanalysis.wordPattern(word);
        // Then
        assertThat(result).isEqualTo("0.1.2.2.3");
    }

    @Test
    public void whenThereIsLetterReoccurrenceInLongWord_wordPattern_shouldUseTheSameNumberForIdenticalLetters() {
        // Given
        String word = "Hippopotomonstrosesquippedaliophobia";
        // When
        String result = cryptanalysis.wordPattern(word);
        // Then
        assertThat(result).isEqualTo("0.1.2.2.3.2.3.4.3.5.3.6.7.4.8.3.7.9.7.10.11.1.2.2.9.12.13.14.1.3.2.0.3.15.1.13");
    }

}