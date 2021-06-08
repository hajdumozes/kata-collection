package sevenkyu.mylanguages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class MyLanguagesTest {
    MyLanguages myLanguages;

    @BeforeEach
    public void init() {
        myLanguages = new MyLanguages();
    }

    @Test
    public void givenPointsBelowLimit_myLanguages_shouldNotReturnIt() {
        // Given
        Map<String, Integer> languages = Map.of("Ruby", 10);
        // When
        List<String> result = myLanguages.myLanguages(languages);
        // Then
        assertThat(result.isEmpty()).isTrue();
    }

    @Test
    public void givenPointsOnLimit_myLanguages_shouldReturnIt() {
        // Given
        Map<String, Integer> languages = Map.of("JavaScript", MyLanguages.PASSING_SCORE);
        // When
        List<String> result = myLanguages.myLanguages(languages);
        // Then
        assertThat(result).isEqualTo(List.of("JavaScript"));

    }

    @Test
    public void givenPointsAboveLimit_myLanguages_shouldReturnIt() {
        // Given
        Map<String, Integer> languages = Map.of("Java", 80);
        // When
        List<String> result = myLanguages.myLanguages(languages);
        // Then
        assertThat(result).isEqualTo(List.of("Java"));
    }

    @Test
    public void givenMultipleLanguagesPresent_myLanguages_shouldOrderThemByPointDescending() {
        // Given
        Map<String, Integer> languages = Map.of("Ruby", 10, "JavaScript", 60, "Java", 80);
        // When
        List<String> result = myLanguages.myLanguages(languages);
        // Then
        assertThat(result).isEqualTo(List.of("Java", "JavaScript"));
    }

}