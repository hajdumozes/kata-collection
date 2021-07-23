package sevenkyu.triangle;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TriangleTest {
    Triangle triangle;

    @BeforeEach
    void init() {
        triangle = new Triangle();
    }

    @Test
    void givenSideAIsSmallerThan1_isTriangle_shouldThrowError() {
        // given
        int a = 0;
        int b = 1;
        int c = 1;

        // when
        ThrowableAssert.ThrowingCallable isTriangle = () -> triangle.isTriangle(a, b, c);

        // then
        assertThatThrownBy(isTriangle).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void givenSideBIsSmallerThan1_isTriangle_shouldThrowError() {
        // given
        int a = 1;
        int b = 0;
        int c = 1;

        // when
        ThrowableAssert.ThrowingCallable isTriangle = () -> triangle.isTriangle(a, b, c);

        // then
        assertThatThrownBy(isTriangle).isInstanceOf(IllegalArgumentException.class);
    }
}