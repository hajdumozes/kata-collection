package sevenkyu.mylanguages;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class MyLanguages {
    static final int PASSING_SCORE = 60;

    public List<String> myLanguages(final Map<String, Integer> results) {
        return results.entrySet().stream()
            .filter(entry -> entry.getValue() >= PASSING_SCORE)
            .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    }
}
