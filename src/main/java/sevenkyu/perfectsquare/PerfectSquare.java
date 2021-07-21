package sevenkyu.perfectsquare;

class PerfectSquare {

    public long findNextSquare(long sq) {
        double sqrt = Math.sqrt(sq);
        if (sqrt != Math.floor(sqrt)) {
            return -1;
        }
        return (long) Math.pow(sqrt + 1, 2);
    }
}
