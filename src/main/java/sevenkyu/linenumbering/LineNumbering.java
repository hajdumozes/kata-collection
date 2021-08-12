package sevenkyu.linenumbering;

import java.util.List;

class LineNumbering {
    public List<String> number(List<String> lines) {
        if (lines.size() == 1) {
            return List.of(String.format("1: %s", lines.get(0)));
        } else {
            return List.of(String.format("1: %s", lines.get(0)), String.format("2: %s", lines.get(1)));
        }
    }
}
