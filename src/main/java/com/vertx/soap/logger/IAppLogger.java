package com.vertx.soap.logger;

public interface IAppLogger {

    /**
     * Log an info level message
     *
     * @param message the message
     */
    void info(String message);

    /**
     * Log an info level message
     *
     * @param message the message
     * @param args positional arguments {0} ... {N-1}.
     */
    void info(String message, Object... args);

    /**
     * Log a warning
     *
     * @param message the message
     */
    void warn(String message);

    /**
     * Log a warning
     *
     * @param message the message
     * @param args positional arguments {0} ... {N-1}.
     */
    void warn(String message, Object... args);

    /**
     * Log a debug level message
     *
     * @param message the message
     */
    void debug(String message);

    /**
     * Log a debug level message
     *
     * @param message the message
     * @param args positional arguments {0} ... {N-1}.
     */
    void debug(String message, Object... args);

    /**
     * Log a trace level message
     *
     * @param message the message
     */
    void trace(String message);

    /**
     * Log a trace level message
     *
     * @param message the message
     * @param args positional arguments {0} ... {N-1}.
     */
    void trace(String message, Object... args);

    /**
     * Log an error level message.
     *
     * @param error the error
     */
    void error(Throwable error);

    /**
     * Log an error level message.
     *
     * @param message the message
     * @param error the error
     */
    void error(String message, Throwable error);

    /**
     * Log an error level message.
     *
     * @param error the error
     * @param message the message
     * @param args positional arguments {0} ... {N-1}.
     */
    void error(Throwable error,  String message, Object... args);
}