package sevenkyu.linenumbering;

import java.util.List;

class LineNumbering {
    public List<String> number(List<String> lines) {
        return List.of(String.format("1: %s", lines.get(0)));
    }
}
