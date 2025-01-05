package LoggerClasses;

abstract public class LogProcessor {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    LogProcessor nextProcessor;

    LogProcessor(LogProcessor nextLogProcessor) {
        this.nextProcessor = nextLogProcessor;
    }

    public void log(int level, String message) {
        // Process current log level (implementation should be in the subclass)
        if (this.nextProcessor != null) {
            nextProcessor.log(level, message);
        }
    }
}
