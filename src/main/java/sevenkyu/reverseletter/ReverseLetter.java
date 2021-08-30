package sevenkyu.reverseletter;

class ReverseLetter {
    public String reverseLetter(final String str) {
        String onlyAlphabeticChars = str.replaceAll("[^a-zA-Z].","");
        return new StringBuilder(onlyAlphabeticChars).reverse().toString();
    }
}
