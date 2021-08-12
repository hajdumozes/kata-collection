package sevenkyu.linenumbering;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

class LineNumbering {
    public List<String> number(List<String> lines) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        return lines.stream()
            .map(string -> String.format("%d: %s", atomicInteger.getAndIncrement(), string))
            .collect(Collectors.toList());
    }
}
