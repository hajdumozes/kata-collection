package sevenkyu.growthofpopulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class GrowthOfPopulationTest {

    GrowthOfPopulation growthOfPopulation;

    @BeforeEach
    public void init() {
        growthOfPopulation = new GrowthOfPopulation();
    }

    @Test
    public void nbYear_shouldReturnWithYearsToReachGoalPopulationCase1() {
        // Given
        // When
        int years = growthOfPopulation.nbYear(1500, 5, 100, 5000);
        // Then
        assertThat(years).isEqualTo(15);
    }

    @Test
    public void nbYear_shouldReturnWithYearsToReachGoalPopulationCase2() {
        // Given
        // When
        int years = growthOfPopulation.nbYear(1500000, 2.5, 10000, 2000000);
        // Then
        assertThat(years).isEqualTo(10);
    }

    @Test
    public void nbYear_shouldReturnWithYearsToReachGoalPopulationCase3() {
        // Given
        // When
        int years = growthOfPopulation.nbYear(1500000, 0.25, 1000, 2000000);
        // Then
        assertThat(years).isEqualTo(94);
    }

}