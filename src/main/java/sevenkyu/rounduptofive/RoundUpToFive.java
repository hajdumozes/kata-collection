package sevenkyu.rounduptofive;

class RoundUpToFive {
    public int roundToNext5(int number) {
        double divisor = (double) number / 5;
        double roundedUpDivisor = Math.ceil(divisor);
        return (int) (5 * roundedUpDivisor);
    }
}
