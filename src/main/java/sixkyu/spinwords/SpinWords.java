package sixkyu.spinwords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    private static final int LETTER_LIMIT_FOR_REVERSE = 5;
    private static final String DELIMITER = " ";

    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(DELIMITER))
            .map(this::reverseLongWords)
            .collect(Collectors.joining(DELIMITER));
    }

    private String reverseLongWords(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(word);
        if (word.length() >= LETTER_LIMIT_FOR_REVERSE) {
            stringBuilder.reverse();
        }
        return stringBuilder.toString();
    }
}
