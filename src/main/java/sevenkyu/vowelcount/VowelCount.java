package sevenkyu.vowelcount;

import java.util.List;
import java.util.stream.IntStream;

class VowelCount {
    private static final List<Character> VOWELS = List.of('a', 'e', 'i', 'o', 'u');

    public int getCount(String str) {
        return (int) IntStream.range(0, str.length())
            .mapToObj(str::charAt)
            .map(Character::toLowerCase)
            .filter(VOWELS::contains)
            .count();
    }
}
