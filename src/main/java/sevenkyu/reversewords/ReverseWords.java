package sevenkyu.reversewords;

import java.util.Arrays;
import java.util.stream.Collectors;

class ReverseWords {

    public String reverse(String original) {
        if (original.isBlank()) {
            return original;
        }
        String[] split = original.split(" ");
        return Arrays.stream(split)
            .map(word -> new StringBuilder(word).reverse().toString())
            .collect(Collectors.joining(" "));
    }
}
