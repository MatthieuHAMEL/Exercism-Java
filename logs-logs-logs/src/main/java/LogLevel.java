public enum LogLevel {
    UNKNOWN(0),
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42);

    // Java could have done better than this boilerplate!...
    private final int val;
    private LogLevel(int val) {
        this.val = val;
    }

    public int getValue() {
        return val;
    }
}
