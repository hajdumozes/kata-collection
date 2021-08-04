package sevenkyu.countdigit;

import java.util.stream.IntStream;

class CountDigit {

    public int nbDig(int squareTop, int digit) {
        return IntStream.range(0, squareTop + 1)
            .map(number -> number * number)
            .mapToObj(String::valueOf)
            .mapToInt(string -> string.length() - string.replaceAll(String.valueOf(digit), "").length())
            .sum();
    }
}
