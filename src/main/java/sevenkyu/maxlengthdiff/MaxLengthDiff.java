package sevenkyu.maxlengthdiff;

class MaxLengthDiff {

    public int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }
        return a1[0].length() - a2[0].length();
    }
}
