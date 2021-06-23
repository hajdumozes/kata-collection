package sevenkyu.middlecharacter;

class MiddleCharacter {

    public String getMiddle(String word) {
        int middlePosition = (word.length() + 1) / 2;
        return Character.toString(word.charAt(middlePosition - 1));
    }
}
