package sevenkyu.timecounter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TimeCounterTest {
    TimeCounter timeCounter;

    @BeforeEach
    public void init() {
        timeCounter = new TimeCounter();
    }

    @Test
    public void givenTimeIsLessThenAnHour_toTime_shouldIncludeZeroHours() {
        // Given
        int seconds = 3500;
        // When
        String output = timeCounter.toTime(seconds);
        // Then
        assertThat(output).isEqualTo(TimeCounter.OUTPUT_FORMAT, 0, 58);
    }

    @Test
    public void givenTimeIsExactlyAnHour_toTime_shouldIncludeZeroMinutes() {
        // Given
        int seconds = 3600;
        // When
        String output = timeCounter.toTime(seconds);
        // Then
        assertThat(output).isEqualTo(TimeCounter.OUTPUT_FORMAT, 1, 0);
    }

    @Test
    public void givenTimeIsAboveAnHour_toTime_shouldIncludeNonZeroHoursAndMinutes() {
        // Given
        int seconds = 323500;
        // When
        String output = timeCounter.toTime(seconds);
        // Then
        assertThat(output).isEqualTo(TimeCounter.OUTPUT_FORMAT, 89, 51);
    }

}