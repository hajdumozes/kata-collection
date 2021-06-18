package sevenkyu.vowelcount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VowelCountTest {
    VowelCount vowelCount;

    @BeforeEach
    public void init() {
        vowelCount = new VowelCount();
    }

    @Test
    public void getCount_shouldReturnTheCountOfVowelsInString() {
        // Given
        String string = "abracadabra";
        // When
        int count = vowelCount.getCount(string);
        // Then
        assertThat(count).isEqualTo(5);
    }

    @Test
    public void getCount_shouldNotCountYLetter() {
        // Given
        String string = "yay";
        // When
        int count = vowelCount.getCount(string);
        // Then
        assertThat(count).isEqualTo(1);
    }

}