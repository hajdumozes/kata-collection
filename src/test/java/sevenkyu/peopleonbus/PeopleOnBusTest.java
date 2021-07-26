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
        assertThat(output).isEqualTo(0);
    }
}