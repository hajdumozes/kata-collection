package sevenkyu.chocolatebreaking;

class ChocolateBreaking {
    public int breakChocolate(int n, int m) {
        if (n == 0) {
            return 0;
        }
        return n * m - 1;
    }
}
