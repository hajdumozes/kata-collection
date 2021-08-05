package sevenkyu.countdivisior;

import java.util.stream.IntStream;

class CountDivisor {

    public long numberOfDivisors(int n) {
        return IntStream.range(1, n + 1)
            .filter(index -> n % index == 0)
            .count();
    }
}
