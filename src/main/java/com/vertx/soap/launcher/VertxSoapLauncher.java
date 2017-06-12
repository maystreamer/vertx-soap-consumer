package com.vertx.soap.launcher;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.impl.launcher.VertxCommandLauncher;
import io.vertx.core.impl.launcher.VertxLifecycleHooks;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.SLF4JLogDelegateFactory;

public class VertxSoapLauncher extends VertxCommandLauncher implements VertxLifecycleHooks {

	// logger should be there
	static {
		if (System.getProperty("vertx.logger-delegate-factory-class-name") == null) {
			System.setProperty("vertx.logger-delegate-factory-class-name", SLF4JLogDelegateFactory.class.getCanonicalName());
		}
	}

	@Override
	public void afterConfigParsed(JsonObject config) {

	}

	@Override
	public void beforeStartingVertx(VertxOptions options) {

	}

	@Override
	public void afterStartingVertx(Vertx vertx) {

	}

	@Override
	public void beforeDeployingVerticle(DeploymentOptions deploymentOptions) {

	}

	@Override
	public void handleDeployFailed(Vertx vertx, String mainVerticle, DeploymentOptions deploymentOptions, Throwable cause) {
		vertx.close();
	}

	public static void main(String[] args) {
		new VertxSoapLauncher().dispatch(args);
	}

	public static void executeCommand(String cmd, String... args) {
		new VertxSoapLauncher().execute(cmd, args);
	}
}