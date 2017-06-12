package com.vertx.soap.handler;

import com.vertx.soap.constants.MediaType;

import io.vertx.core.Handler;
import io.vertx.rxjava.ext.web.RoutingContext;

public class HeaderHandler implements Handler<RoutingContext> {

	@Override
	public void handle(RoutingContext context) {
		context.addHeadersEndHandler(done -> {
			context.response().putHeader(MediaType.CONTENT_TYPE, MediaType.APPLICATION_JSON);
			context.response().setChunked(true);
		});
		context.next();
	}
}