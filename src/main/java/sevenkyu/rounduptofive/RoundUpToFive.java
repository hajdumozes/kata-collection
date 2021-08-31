package sevenkyu.rounduptofive;

class RoundUpToFive {
    public int roundToNext5(int number) {
        if (number % 5 == 0) {
            return number;
        }
        int remainder = number % 5;
        return number + 5 - remainder;
    }
}
