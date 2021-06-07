package sixkyu.spinwords;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SpinWordsTest {
    SpinWords spinWords;

    @BeforeEach
    public void init() {
        spinWords = new SpinWords();
    }

    @Test
    public void givenLetterIsUnder5Characters_spinWords_shouldNotReverseWord() {
        // Given
        String word = "test";
        // When
        String result = spinWords.spinWords(word);
        // Then
        assertThat(result).isEqualTo("test");
    }

    @Test
    public void givenLetterIsExactly5Characters_spinWords_shouldReverseWord() {
        // Given
        String word = "apple";
        // When
        String result = spinWords.spinWords(word);
        // Then
        assertThat(result).isEqualTo("elppa");
    }

    @Test
    public void givenLetterIsAbove5Characters_spinWords_shouldReverseWord() {
        // Given
        String word = "banana";
        // When
        String result = spinWords.spinWords(word);
        // Then
        assertThat(result).isEqualTo("ananab");
    }

    @Test
    public void givenSentenceWithWordsBelow5Characters_spinWords_shouldNotReverseWord() {
        // Given
        String sentence = "this is test";
        // When
        String result = spinWords.spinWords(sentence);
        // Then
        assertThat(result).isEqualTo("this is test");
    }

    @Test
    public void givenSentenceWithWordsExactly5Characters_spinWords_shouldReverseWord() {
        // Given
        String sentence = "this is apple";
        // When
        String result = spinWords.spinWords(sentence);
        // Then
        assertThat(result).isEqualTo("this is elppa");
    }

    @Test
    public void givenSentenceWithWordsAbove5Characters_spinWords_shouldReverseWord() {
        // Given
        String sentence = "this is banana";
        // When
        String result = spinWords.spinWords(sentence);
        // Then
        assertThat(result).isEqualTo("this is ananab");
    }
}