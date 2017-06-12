package com.vertx.soap.logger;

import java.text.MessageFormat;

import org.slf4j.Logger;

public class AppSlf4jLoggerImpl implements IAppLogger {
	private final Logger logger;

	public AppSlf4jLoggerImpl(Logger slf4jLogger) {
		this.logger = slf4jLogger;
	}

	@Override
	public void info(String message) {
		logger.info(message);
	}

	@Override
	public void info(String message, Object... args) {
		logger.info(message, args);
	}

	@Override
	public void warn(String message) {
		logger.warn(message);
	}

	@Override
	public void warn(String message, Object... args) {
		logger.warn(message, args);
	}

	@Override
	public void debug(String message) {
		logger.debug(message);
	}

	@Override
	public void debug(String message, Object... args) {
		logger.debug(message, args);
	}

	@Override
	public void trace(String message) {
		logger.trace(message);
	}

	@Override
	public void trace(String message, Object... args) {
		logger.trace(message, args);
	}

	@Override
	public void error(Throwable error) {
		logger.error(error.getMessage(), error);
	}

	@Override
	public void error(String message, Throwable error) {
		logger.error(message, error);
	}

	@Override
	public void error(Throwable error, String message, Object... args) {
		if (logger.isErrorEnabled()) {
			String formatted = MessageFormat.format(message, args);
			logger.error(formatted, error);
		}
	}
}