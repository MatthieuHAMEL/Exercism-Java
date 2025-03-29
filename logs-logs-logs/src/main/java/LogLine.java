public class LogLine {

    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        switch(this.logLine.substring(0, this.logLine.indexOf(':')))
        {
            case "[TRC]":
                return LogLevel.TRACE;
            case "[DBG]":
                return LogLevel.DEBUG;
            case "[INF]":
                return LogLevel.INFO;
            case "[WRN]":
                return LogLevel.WARNING;
            case "[ERR]":
                return LogLevel.ERROR;
            case "[FTL]":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        return Integer.toString(this.getLogLevel().getValue()) + ":" 
            + this.logLine.substring(2 + this.logLine.indexOf(':'), this.logLine.length());
    }
}

