package sevenkyu.disemvowel;

class Disemvowel {

    public String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }
}
