package sevenkyu.square;

class Square {

    public boolean isSquare(int n) {
        double squareRoot = Math.sqrt(n);
        return squareRoot == Math.floor(squareRoot);
    }
}
