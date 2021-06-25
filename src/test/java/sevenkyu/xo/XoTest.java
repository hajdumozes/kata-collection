package sevenkyu.xo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class XoTest {
    Xo xo;

    @BeforeEach
    void init() {
        xo = new Xo();
    }

    @Test
    void givenNoXOrO_getXO_shouldReturnTrue() {
        // given
        String input = "test";
        // when
        boolean output = this.xo.getXO(input);
        // then
        assertThat(output).isTrue();
    }

}