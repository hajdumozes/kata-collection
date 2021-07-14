package sevenkyu.complementarydna;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ComplementaryDna {
    static final Map<Character, Character> COMPLEMENTS = Map.of('T', 'A', 'A', 'T', 'G', 'C', 'C', 'G');

    public String makeComplement(String dna) {
        return IntStream.range(0, dna.length())
            .mapToObj(dna::charAt)
            .map(COMPLEMENTS::get)
            .map(Object::toString)
            .collect(Collectors.joining());
    }
}
