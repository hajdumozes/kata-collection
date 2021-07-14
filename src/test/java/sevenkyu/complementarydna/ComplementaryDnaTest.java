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

        // when
        String output = complementaryDna.makeComplement(input);

        // then
        assertThat(input).isEqualTo(output);
    }
}