package com.vertx.soap.config;

import static com.vertx.soap.constants.Constants.DEPLOYMENT_CONFIG;
import static com.vertx.soap.constants.Constants.HTTP_HOST;
import static com.vertx.soap.constants.Constants.PACKAGE_NAME;
import static com.vertx.soap.constants.Constants.VERTICLE_PORT;

import io.vertx.core.json.JsonObject;

public enum AppConfig implements IAppConfig {
	INSTANCE;
	private JsonObject config;

	@Override
	public JsonObject getConfig() {
		return this.config;
	}

	@Override
	public IAppConfig setConfig(final JsonObject config) {
		this.config = config;
		return AppConfig.INSTANCE;
	}

	@Override
	public JsonObject getDeploymentOptions() {
		return loadConfig(this.config, DEPLOYMENT_CONFIG);
	}

	@Override
	public int getPort() {
		return this.config.getInteger(VERTICLE_PORT, 8080);
	}

	@Override
	public String getPackageName() {
		return this.config.getString(PACKAGE_NAME, "com.vertx.soap.handler");
	}

	@Override
	public String getHost() {
		return this.config.getString(HTTP_HOST, "localhost");
	}

	protected JsonObject loadConfig(final JsonObject obj, String key) {
		return obj.getJsonObject(key, new JsonObject());
	}
}