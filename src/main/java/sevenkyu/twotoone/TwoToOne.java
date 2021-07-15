package sevenkyu.twotoone;

class TwoToOne {

    public String longest(String s1, String s2) {
        return s1.concat(s2).chars()
            .sorted()
            .distinct()
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();
    }
}
