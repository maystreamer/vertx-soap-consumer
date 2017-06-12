package com.vertx.soap.handler;

import static com.vertx.soap.constants.Constants.RESPONSE_FAILED;

import com.vertx.soap.exception.ExceptionMapper;
import com.vertx.soap.models.RestErrorBuilder;
import com.vertx.soap.models.RestResponse;
import com.vertx.soap.util.JsonUtil;
import com.vertx.soap.util.ResponseUtil;

import io.vertx.rxjava.ext.web.RoutingContext;

public class ErrorHandler extends BaseHandler {

	@Override
	public void handle(RoutingContext context) {
		final Exception exception = (Exception) context.failure();
		final RestResponse<RestErrorBuilder> response = ResponseUtil.buildResponse(500, RESPONSE_FAILED, ExceptionMapper.build(exception), true);
		context.response().setStatusCode(500);
		context.response().end(JsonUtil.toJsonString(response));
	}
}