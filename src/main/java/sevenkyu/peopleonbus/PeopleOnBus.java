package sevenkyu.peopleonbus;

import java.util.List;

class PeopleOnBus {

    public int countPassengers(List<int[]> stops) {
        int in = 0;
        int out = 0;
        for (int[] stop : stops) {
            in += stop[0];
            out += stop[1];
        }
        return in - out;
    }
}
