package sevenkyu.peopleonbus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PeopleOnBusTest {
    PeopleOnBus peopleOnBus;

    @BeforeEach
    void init() {
        peopleOnBus = new PeopleOnBus();
    }

    @Test
    void givenEmptyInput_countPassenger_shouldReturnWithZero() {
        // given
        List<int[]> input = List.of();
        int expected = 0;

        // when
        int output = peopleOnBus.countPassengers(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenOneArrayInput_countPassenger_shouldReturnWithFirstElement() {
        // given
        List<int[]> input = List.of(new int[]{10, 0});
        int expected = 10;

        // when
        int output = peopleOnBus.countPassengers(input);

        // then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void givenTwoArrayInput_countPassenger_shouldReturnFirstElementSumMinusSecondElementSum() {
        // given
        List<int[]> input = List.of(new int[]{10, 0}, new int[]{3, 5});
        int expected = 8;

        // when
        int output = peopleOnBus.countPassengers(input);

        // then
        assertThat(output).isEqualTo(expected);
    }
}