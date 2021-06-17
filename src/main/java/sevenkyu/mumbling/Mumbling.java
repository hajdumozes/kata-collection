package sevenkyu.mumbling;

import java.util.stream.Collectors;

class Mumbling {
    private static final String separator = "-";

    public String accum(String s) {
        return s.chars()
            .boxed()
            .map(Character::toUpperCase)
            .map(Character::toString)
            .collect(Collectors.joining(separator));
    }
}
