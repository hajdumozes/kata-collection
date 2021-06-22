package sevenkyu.disemvowel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DisemvowelTest {
    Disemvowel disemvowel;

    @BeforeEach
    public void init() {
        disemvowel = new Disemvowel();
    }

    @Test
    public void givenNoVowelInString_disemvowel_shouldReturnInput() {
        // Given
        String input = "wrd";
        // When
        String output = this.disemvowel.disemvowel(input);
        // Then
        assertThat(output).isEqualTo(input);
    }

}