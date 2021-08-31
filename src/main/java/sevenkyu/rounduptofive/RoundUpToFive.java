package sevenkyu.rounduptofive;

class RoundUpToFive {
    public int roundToNext5(int number) {
        double division = (double) number / 5;
        double roundedUpDivision = Math.ceil(division);
        return (int) (5 * roundedUpDivision);
    }
}
