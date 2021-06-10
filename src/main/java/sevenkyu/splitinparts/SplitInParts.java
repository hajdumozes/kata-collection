package sevenkyu.splitinparts;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class SplitInParts {

    public String splitInParts(String string, int partLength) {
        return IntStream.range(0, string.length())
            .filter(index -> index % partLength == 0)
            .mapToObj(index -> string.substring(index, Math.min(index + partLength, string.length())))
            .collect(Collectors.joining(" "));
    }
}
