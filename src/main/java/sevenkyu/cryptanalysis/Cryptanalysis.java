package sevenkyu.cryptanalysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Cryptanalysis {
    private static final String DELIMITER = ".";

    public String wordPattern(String word) {
        Map<Character, Integer> map = new HashMap<>();
        int counter = -1;
        List<Integer> result = new ArrayList<>();
        for (Character character : word.toLowerCase().toCharArray()) {
            if (!map.containsKey(character)) {
                counter++;
            }
            map.putIfAbsent(character, counter);
            result.add(map.get(character));
        }
        return result.stream()
            .map(String::valueOf)
            .collect(Collectors.joining(DELIMITER));
    }
}
