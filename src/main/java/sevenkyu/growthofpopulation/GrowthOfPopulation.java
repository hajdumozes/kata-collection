package sevenkyu.growthofpopulation;

class GrowthOfPopulation {

    /**
     * @param startingPopulation
     * @param growthPercent
     * @param yearlyChange
     * @param goalPopulation
     * @return number of years, after startingPopulation is bigger then goalPopulation
     */
    public int nbYear(int startingPopulation, double growthPercent, int yearlyChange, int goalPopulation) {
        int passedYears = 0;
        int currentPopulation = startingPopulation;
        while (currentPopulation < goalPopulation) {
            currentPopulation += currentPopulation / 100 * growthPercent;
            currentPopulation += yearlyChange;
            passedYears++;
        }
        return passedYears;
    }
}
