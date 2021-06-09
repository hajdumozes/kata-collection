package sevenkyu.timecounter;

class TimeCounter {
    private static final int HOUR_IN_SECONDS = 3600;
    private static final int MINUTE_IN_SECONDS = 60;
    static final String OUTPUT_FORMAT = "%d hour(s) and %d minute(s)";

    public String toTime(int seconds) {
        int hours = seconds / HOUR_IN_SECONDS;
        int minutes = (seconds % HOUR_IN_SECONDS) / MINUTE_IN_SECONDS;
        return String.format(OUTPUT_FORMAT, hours, minutes);
    }
}
