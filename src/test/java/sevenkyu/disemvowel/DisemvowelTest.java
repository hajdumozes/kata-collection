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

    @Test
    public void disemvowel_shouldRemoveVowelsFromInput() {
        // Given
        String input = "What are you, a communist?";
        // When
        String output = this.disemvowel.disemvowel(input);
        // Then
        assertThat(output).isEqualTo("Wht r y,  cmmnst?");
    }

    @Test
    public void disemvowel_shouldNotEffectNonVowelCharacters() {
        // Given
        String input = "No offense but,\\nYour writing is among the worst I've ever read";
        // When
        String output = this.disemvowel.disemvowel(input);
        // Then
        assertThat(output).isEqualTo("N ffns bt,\\nYr wrtng s mng th wrst 'v vr rd");
    }

}