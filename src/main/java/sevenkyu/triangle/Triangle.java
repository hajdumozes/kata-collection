package sevenkyu.triangle;

class Triangle {

    public boolean isTriangle(int a, int b, int c) {
        if (a < 1 || b < 1 || c < 1) {
            throw new IllegalArgumentException();
        }
        if (a > b + c) {
            return false;
        }
        if (b > a + c) {
            return false;
        }
        return true;
    }
}
