package sevenkyu.stringendswith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringEndsWithTest {
    StringEndsWith stringEndsWith;

    @BeforeEach
    void init() {
        stringEndsWith = new StringEndsWith();
    }

    @Test
    void givenAEndsWithA_solution_shouldReturnTrue() {
        // given
        String string = "a";
        String endsWith = "a";

        // when
        boolean output = stringEndsWith.solution(string, endsWith);

        // then
        assertThat(output).isTrue();
    }

    @Test
    void givenAAEndsWithA_solution_shouldReturnTrue() {
        // given
        String string = "aa";
        String endsWith = "a";

        // when
        boolean output = stringEndsWith.solution(string, endsWith);

        // then
        assertThat(output).isTrue();
    }

    @Test
    void givenAbcEndsWithD_solution_shouldReturnFalse() {
        // given
        String string = "abc";
        String endsWith = "d";

        // when
        boolean output = stringEndsWith.solution(string, endsWith);

        // then
        assertThat(output).isFalse();
    }

    @Test
    void givenAbcEndsWithCb_solution_shouldReturnFalse() {
        // given
        String string = "abc";
        String endsWith = "cb";

        // when
        boolean output = stringEndsWith.solution(string, endsWith);

        // then
        assertThat(output).isFalse();
    }

    @Test
    void givenAbcEndsWithBc_solution_shouldReturnTrue() {
        // given
        String string = "abc";
        String endsWith = "bc";

        // when
        boolean output = stringEndsWith.solution(string, endsWith);

        // then
        assertThat(output).isTrue();
    }
}