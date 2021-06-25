package sevenkyu.xo;

class Xo {

    public boolean getXO(String str) {
        int xCounter = 0;
        int oCounter = 0;
        for (Character character : str.toCharArray()) {
            if (Character.toLowerCase(character) == 'x') {
                xCounter++;
            }
            if (Character.toLowerCase(character) == 'o') {
                oCounter++;
            }
        }
        return xCounter == oCounter;
    }
}
