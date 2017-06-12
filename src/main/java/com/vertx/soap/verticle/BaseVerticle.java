package com.vertx.soap.verticle;

import java.util.HashSet;
import java.util.Set;

import com.vertx.soap.annotations.AnnotationProcessor;
import com.vertx.soap.config.AppConfig;
import com.vertx.soap.config.IAppConfig;
import com.vertx.soap.logger.AppSlf4jDelegateFactory;
import com.vertx.soap.logger.IAppLogger;

import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.rxjava.core.AbstractVerticle;
import io.vertx.rxjava.core.http.HttpServer;
import io.vertx.rxjava.ext.web.Router;
import io.vertx.rxjava.ext.web.handler.CorsHandler;
import rx.Single;

public abstract class BaseVerticle extends AbstractVerticle {
	protected static final IAppLogger logger = new AppSlf4jDelegateFactory().createLogger(BaseVerticle.class);
	protected IAppConfig iConfig;
	protected Router router;

	@Override
	public void start() throws Exception {
		this.iConfig = getConfig();
		buildRouter();
	}

	@Override
	public void init(io.vertx.core.Vertx vertx, Context context) {
		super.init(vertx, context);
	}

	@Override
	public void stop(Future<Void> stopFuture) throws Exception {
		super.stop(stopFuture);
	}

	protected void buildRouter() {
		this.router = Router.router(vertx).exceptionHandler((error -> {
			logger.error("Routers not injected", error);
		}));
		AnnotationProcessor.init(router);
	}

	protected IAppConfig getConfig() {
		final JsonObject config = config();
		if (config.isEmpty()) {
			throw new IllegalStateException("Configuration not provided!");
		}
		return AppConfig.INSTANCE.setConfig(config);
	}

	protected Single<HttpServer> createHttpServer(HttpServerOptions httpOptions, Router router, String host, int port) {
		Single<HttpServer> server = vertx.createHttpServer()
										 .requestHandler(router::accept)
										 .rxListen(port, host);
		return server;
	}

	protected void enableCorsSupport(Router router) {
		Set<String> allowHeaders = new HashSet<>();
		allowHeaders.add("x-requested-with");
		allowHeaders.add("Access-Control-Allow-Origin");
		allowHeaders.add("origin");
		allowHeaders.add("Content-Type");
		allowHeaders.add("accept");
		router.route()
			  .handler(CorsHandler.create("*")
					  	.allowedHeaders(allowHeaders)
					  	.allowedMethod(HttpMethod.GET)
						.allowedMethod(HttpMethod.POST)
						.allowedMethod(HttpMethod.PUT)
						.allowedMethod(HttpMethod.DELETE)
						.allowedMethod(HttpMethod.PATCH)
						.allowedMethod(HttpMethod.OPTIONS));
	}

	// public static void main(String[] args) {
	// vertx.rxDeployVerticle(BulldozerVerticle.class.getCanonicalName(),
	// getConfig().getDeploymentOptions())
	// .doOnSubscribe(() -> logger.info("Starting Bulldozer Service"))
	// .doOnError(throwable -> {
	// System.out.println(throwable);
	// })
	// .subscribe(deploymentId -> logger.info("Bulldozer Verticle deployed with
	// id: {}", deploymentId),
	// failure -> {
	// failure.printStackTrace();
	// vertx.close();
	// });
	// }
}