package sevenkyu.paintletterboxes;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PaintLetterBoxes {

    /**
     * @param start: inclusive starting number to collect letters from
     * @param end:   inclusive ending number to collect letters from
     * @return a 10 length array (indicating letters 0-9), with the occurrence of digits in the parameter numbers
     */
    public int[] paintLetterboxes(final int start, final int end) {
        int[] letters = new int[10];
        IntStream.range(start, end + 1)
            .mapToObj(String::valueOf)
            .map(number -> number.split(""))
            .flatMap(Arrays::stream)
            .mapToInt(Integer::parseInt)
            .forEach(number -> letters[number]++);
        return letters;
    }
}
