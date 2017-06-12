package com.vertx.soap.verticle;

import io.vertx.core.Future;
import io.vertx.rxjava.core.http.HttpServer;
import rx.Single;

public class AppVerticle extends BaseVerticle {

	@Override
	public void start(Future<Void> startFuture) {
		try {
			super.start();
			final int port = iConfig.getPort();
			final String host = iConfig.getHost();
			Single<HttpServer> server = createHttpServer(null, router, host, port);
			server.subscribe(result -> {
				startFuture.complete();
				logger.info("Vertx initialized");
			});
		} catch (Exception ex) {
			logger.error("Exception while starting BulldozerVerticle", ex);
		}
	}
}