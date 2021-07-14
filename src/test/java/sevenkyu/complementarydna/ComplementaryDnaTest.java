package sevenkyu.complementarydna;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ComplementaryDnaTest {
    ComplementaryDna complementaryDna;

    @BeforeEach
    void init() {
        complementaryDna = new ComplementaryDna();
    }

    @Test
    void givenCharacterA_makeComplement_shouldReplacedThemWithCharacterT() {
        // given
        String input = "AAA";
        String expectedOutput = "TTT";

        // when
        String output = complementaryDna.makeComplement(input);

        // then
        assertThat(output).isEqualTo(expectedOutput);
    }

    @Test
    void givenCharacterT_makeComplement_shouldReplacedThemWithCharacterA() {
        // given
        String input = "TTT";
        String expectedOutput = "AAA";

        // when
        String output = complementaryDna.makeComplement(input);

        // then
        assertThat(output).isEqualTo(expectedOutput);
    }

    @Test
    void givenCharacterG_makeComplement_shouldReplacedThemWithCharacterC() {
        // given
        String input = "GGG";
        String expectedOutput = "CCC";

        // when
        String output = complementaryDna.makeComplement(input);

        // then
        assertThat(output).isEqualTo(expectedOutput);
    }

    @Test
    void givenCharacterC_makeComplement_shouldReplacedThemWithCharacterG() {
        // given
        String input = "CCC";
        String expectedOutput = "GGG";

        // when
        String output = complementaryDna.makeComplement(input);

        // then
        assertThat(output).isEqualTo(expectedOutput);
    }
}