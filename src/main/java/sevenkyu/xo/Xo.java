package sevenkyu.xo;

class Xo {

    public boolean getXO(String str) {
        int xCounter = 0;
        int oCounter = 0;
        for (Character character : str.toLowerCase().toCharArray()) {
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
