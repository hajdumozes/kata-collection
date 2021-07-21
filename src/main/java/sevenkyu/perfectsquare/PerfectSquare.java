package sevenkyu.perfectsquare;

class PerfectSquare {
    static final long NON_SQUARE_RETURN_VALUE = -1;

    public long findNextSquare(long sq) {
        double sqrt = Math.sqrt(sq);
        if (sqrt != Math.floor(sqrt)) {
            return NON_SQUARE_RETURN_VALUE;
        }
        return (long) Math.pow(sqrt + 1, 2);
    }
}
