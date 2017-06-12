package com.vertx.soap.logger;

import org.slf4j.LoggerFactory;

public class AppSlf4jDelegateFactory implements IAppDelegateFactory {
	@Override
	public IAppLogger createLogger(String name) {
		return new AppSlf4jLoggerImpl(LoggerFactory.getLogger(name));
	}

	@Override
	public IAppLogger createLogger(Class<?> klazz) {
		return new AppSlf4jLoggerImpl(LoggerFactory.getLogger(klazz));
	}
}