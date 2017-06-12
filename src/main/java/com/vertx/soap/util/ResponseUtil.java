package com.vertx.soap.util;

import static com.vertx.soap.constants.Constants.RESPONSE_SUCCESS;

import com.vertx.soap.models.RestResponse;

import io.vertx.core.AsyncResult;
import io.vertx.rxjava.ext.web.RoutingContext;

public final class ResponseUtil {

	public static <T> void toRestResponse(final AsyncResult<T> result, final RoutingContext routingContext) {
		if (result.succeeded()) {
			final RestResponse<T> response = buildResponse(200, RESPONSE_SUCCESS, result.result(), false);
			routingContext.response().setStatusCode(200).end(JsonUtil.toJsonString(response));
		} else {
			routingContext.fail(result.cause());
		}
	}

	public static <T> RestResponse<T> buildResponse(int code, String message, T data, boolean hasError) {
		final RestResponse<T> response = new RestResponse.Builder<T>()
												   		 .setCode(code)
												   		 .setHasError(hasError)
												   		 .setData(data)
												   		 .setMessage(message)
												   		 .build();
		return response;
	}
}