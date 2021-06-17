package sevenkyu.mumbling;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Mumbling {
    private static final String separator = "-";

    public String accum(String s) {
        return IntStream.range(0, s.length())
            .mapToObj(index -> repeatCharByIndex(s.charAt(index), index))
            .map(this::capitalize)
            .collect(Collectors.joining(separator));
    }

    private String repeatCharByIndex(char character, int index) {
        return Character.valueOf(character).toString().repeat(index + 1);
    }

    private String capitalize(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }
}
