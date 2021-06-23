package sevenkyu.middlecharacter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MiddleCharacterTest {
    MiddleCharacter middleCharacter;

    @BeforeEach
    void init() {
        middleCharacter = new MiddleCharacter();
    }

    @Test
    void givenInputIsOnlyOneCharacter_getMiddle_shouldReturnInput() {
        // given
        String input = "A";
        // when
        String output = middleCharacter.getMiddle(input);
        // then
        assertThat(output).isEqualTo(input);
    }

    @Test
    void givenInputLengthIsOdd_getMiddle_shouldReturnMiddleCharacter() {
        // given
        String input = "testing";
        // when
        String output = middleCharacter.getMiddle(input);
        assertThat(output).isEqualTo("t");
    }

}