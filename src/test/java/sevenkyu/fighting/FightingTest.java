package sevenkyu.fighting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FightingTest {
    Fighting fighting;

    @BeforeEach
    void init() {
        fighting = new Fighting();
    }

    @Test
    void givenMinimumStatsFirstStarts_declareWinner_shouldReturnFirst() {
        // given
        String starter = "Scorpion";
        Fighting.Fighter scorpion = new Fighting.Fighter(starter, 1, 1);
        Fighting.Fighter subZero = new Fighting.Fighter("Sub Zero", 1, 1);

        // when
        String output = fighting.declareWinner(scorpion, subZero, starter);

        // then
        assertThat(output).isEqualTo(starter);
    }

    @Test
    void givenMinimumStatsSecondStarts_declareWinner_shouldReturnSecond() {
        // given
        String starter = "Sub Zero";
        Fighting.Fighter scorpion = new Fighting.Fighter("Scorpion", 1, 1);
        Fighting.Fighter subZero = new Fighting.Fighter(starter, 1, 1);

        // when
        String output = fighting.declareWinner(scorpion, subZero, starter);

        // then
        assertThat(output).isEqualTo(starter);
    }

    @Test
    void givenOneTurnStatsForBoth_declareWinner_shouldReturnStarter() {
        // given
        String starter = "Sub Zero";
        Fighting.Fighter scorpion = new Fighting.Fighter("Scorpion", 1, 1);
        Fighting.Fighter subZero = new Fighting.Fighter(starter, 1, 1);

        // when
        String output = fighting.declareWinner(scorpion, subZero, starter);

        // then
        assertThat(output).isEqualTo(starter);
    }

    @Test
    void givenSignificantStatDifference_declareWinner_shouldReturnBiggerDamage() {
        // given
        String starter = "Sub Zero";
        String expectedWinner = "Scorpion";
        Fighting.Fighter scorpion = new Fighting.Fighter(expectedWinner, 2, 2);
        Fighting.Fighter subZero = new Fighting.Fighter(starter, 2, 1);

        // when
        String output = fighting.declareWinner(scorpion, subZero, starter);

        // then
        assertThat(output).isEqualTo(expectedWinner);
    }
}