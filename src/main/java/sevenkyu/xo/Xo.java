package sevenkyu.xo;

class Xo {

    public boolean getXO(String str) {
        int xCounter = 0;
        int oCounter = 0;
        for (Character character : str.toCharArray()) {
            if (character == 'x') {
                xCounter++;
            }
            if (character == 'o') {
                oCounter++;
            }
        }
        return xCounter == oCounter;
    }
}
