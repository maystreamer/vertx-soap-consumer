package com.vertx.soap.logger;

public interface IAppDelegateFactory {

	/**
	 * Create a logger by name
	 *
	 * @param name the name
	 * @return the logger
	 */
	IAppLogger createLogger(String name);

	/**
	 * Create a logger by class
	 *
	 * @param clazz the class
	 * @return the logger
	 */
	IAppLogger createLogger(Class<?> clazz);
}
