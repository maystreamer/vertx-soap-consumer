package com.vertx.soap.handler;

import com.vertx.soap.annotations.Get;
import com.vertx.soap.config.AppConfig;
import com.vertx.soap.config.IAppConfig;
import com.vertx.soap.logger.AppSlf4jDelegateFactory;
import com.vertx.soap.logger.IAppLogger;

import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.rxjava.ext.web.RoutingContext;

public abstract class BaseHandler implements Handler<RoutingContext> {
	protected static final IAppLogger logger = new AppSlf4jDelegateFactory().createLogger(BaseHandler.class);
	protected IAppConfig bulldozerConfig = AppConfig.INSTANCE;

	@Override
	@Get("/status")
	public void handle(RoutingContext ctx) {
		ctx.response().end(new JsonObject().put("status", "Ok").toString());
	}
}