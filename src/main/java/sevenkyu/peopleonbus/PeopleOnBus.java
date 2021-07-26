package sevenkyu.peopleonbus;

import java.util.List;

class PeopleOnBus {

    public int countPassengers(List<int[]> stops) {
        return stops.stream()
            .mapToInt(change -> change[0] - change[1])
            .sum();
    }
}
