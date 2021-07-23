package sevenkyu.triangle;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
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

    @Test
    void givenSideCIsSmallerThan1_isTriangle_shouldThrowError() {
        // given
        int a = 1;
        int b = 1;
        int c = 0;

        // when
        ThrowableAssert.ThrowingCallable isTriangle = () -> triangle.isTriangle(a, b, c);

        // then
        assertThatThrownBy(isTriangle).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void givenSidesAreIdentical_isTriangle_shouldReturnTrue() {
        // given
        int a = 1;
        int b = 1;
        int c = 1;

        // when
        boolean isTriangle = this.triangle.isTriangle(a, b, c);

        // then
        assertThat(isTriangle).isTrue();
    }

    @Test
    void givenSideAIsBiggerThanTheTwoOther_isTriangle_shouldReturnFalse() {
        // given
        int a = 7;
        int b = 2;
        int c = 3;

        // when
        boolean isTriangle = this.triangle.isTriangle(a, b, c);

        // then
        assertThat(isTriangle).isFalse();
    }

    @Test
    void givenSideBIsBiggerThanTheTwoOther_isTriangle_shouldReturnFalse() {
        // given
        int a = 3;
        int b = 8;
        int c = 4;

        // when
        boolean isTriangle = this.triangle.isTriangle(a, b, c);

        // then
        assertThat(isTriangle).isFalse();
    }

    @Test
    void givenSideCIsBiggerThanTheTwoOther_isTriangle_shouldReturnFalse() {
        // given
        int a = 3;
        int b = 5;
        int c = 10;

        // when
        boolean isTriangle = this.triangle.isTriangle(a, b, c);

        // then
        assertThat(isTriangle).isFalse();
    }
}