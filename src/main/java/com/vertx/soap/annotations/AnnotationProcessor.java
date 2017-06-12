package com.vertx.soap.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.reflections.Reflections;

import static com.vertx.soap.constants.Constants.*;

import com.vertx.soap.config.AppConfig;
import com.vertx.soap.config.IAppConfig;
import com.vertx.soap.constants.MediaType;
import com.vertx.soap.handler.BaseHandler;
import com.vertx.soap.handler.ErrorHandler;
import com.vertx.soap.handler.HeaderHandler;

import io.vertx.core.http.HttpMethod;
import io.vertx.rxjava.ext.web.Router;
import io.vertx.rxjava.ext.web.handler.BodyHandler;

public final class AnnotationProcessor {
	protected static final IAppConfig config = AppConfig.INSTANCE;
	private static final Reflections reflections = new Reflections(config.getPackageName());

	public static void init(final Router router) {
		Set<Class<? extends BaseHandler>> clazzes = reflections.getSubTypesOf(BaseHandler.class);
		clazzes.forEach(baseHandler -> doScan(router, baseHandler));
	}

	private static void doScan(final Router router, final Class<? extends BaseHandler> clazz) {
		Service service = clazz.getAnnotation(Service.class);
		if (null != service) {
			Arrays.stream(clazz.getMethods()).forEach(method -> {
				Get get = method.getAnnotation(Get.class);
				Post post = method.getAnnotation(Post.class);
				final String url = StringUtils.join(service.version(), service.uri());
				if (get != null) {
					registerRoute(router, HttpMethod.GET, url + get.value(), method, clazz);
				} else if (post != null) {
					registerRoute(router, HttpMethod.POST, url + post.value(), method, clazz);
				}
			});
		}
	}

	private static void registerRoute(final Router router, final HttpMethod method, final String url, final Method m, final Class<? extends BaseHandler> clazz) {
		router.route().handler(new HeaderHandler());
		router.route().handler(BodyHandler.create());
		router.route(method, StringUtils.join("/", APP_NAME, "/", url))
			  .consumes(MediaType.APPLICATION_JSON)
			  .produces(MediaType.APPLICATION_JSON)
			  .handler(ctx -> {
					try {
						m.invoke(clazz.newInstance(), ctx);
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (InstantiationException e) {
						e.printStackTrace();
					}
				});
		router.route().last().failureHandler(new ErrorHandler());
	}
}