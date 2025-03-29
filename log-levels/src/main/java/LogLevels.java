public class LogLevels {
    /**
     * @param logLine A valid log message in format "[LEVEL]: Message. Space is important!
     * @return The trimmed message, e.g. message("[WARNING]: Babar") == "Babar"
     */
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(' ') + 1).trim();
    }

    /**
     * @param logLine A valid log line as specified in {@link #message()}
     * @return The log level in lowercase, e.g. logLevel("[WARNING]: Babar") == "warning"
     */
    public static String logLevel(String logLine) {
        return logLine.substring(1, logLine.indexOf(']')).toLowerCase();
    }

    /**
     * @param logLine A valid log line as specified in {@link #message()}
     * @return The line formatted like : 
     * reformat("[WARNING]: Babar") == "Babar (warning)"
     */
    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
