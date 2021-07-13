package sevenkyu.creditcardmask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CreditCardMaskTest {
    CreditCardMask creditCardMask;

    @BeforeEach
    void init() {
        creditCardMask = new CreditCardMask();
    }

    @Test
    void givenStringIsLessThan4CharactersLong_maskify_shouldNotMask() {
        // given
        String string = "asd";

        // when
        String output = creditCardMask.maskify(string);

        // then
        assertThat(output).isEqualTo(string);
    }
}