package sevenkyu.twotoone;

import java.util.stream.Collectors;

public class TwoToOne {

    public String longest(String s1, String s2) {
        return s1.concat(s2).chars()
            .mapToObj(character -> (char) character)
            .sorted()
            .distinct()
            .map(String::valueOf)
            .collect(Collectors.joining());
    }
}
