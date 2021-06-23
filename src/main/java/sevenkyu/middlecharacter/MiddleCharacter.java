package sevenkyu.middlecharacter;

class MiddleCharacter {

    public String getMiddle(String word) {
        int middleStart = (word.length() + 1) / 2;
        int middleEnd = word.length() % 2 == 0 ? middleStart + 1 : middleStart;
        return word.substring(middleStart - 1, middleEnd);
    }
}
