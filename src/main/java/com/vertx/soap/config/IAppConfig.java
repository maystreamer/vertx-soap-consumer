package com.vertx.soap.config;

import io.vertx.core.json.JsonObject;

public interface IAppConfig {
	public IAppConfig setConfig(JsonObject config);
	public JsonObject getConfig();
	public JsonObject getDeploymentOptions();
	public int getPort();
	public String getHost();
	public String getPackageName();
}