package sevenkyu.complementarydna;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ComplementaryDna {
    Map<Character, Character> complements = Map.of('T', 'A', 'A', 'T', 'G', 'C', 'C', 'G');

    public String makeComplement(String dna) {
        return IntStream.range(0, dna.length())
            .mapToObj(dna::charAt)
            .map(character -> complements.get(character))
            .map(Object::toString)
            .collect(Collectors.joining());
    }
}
