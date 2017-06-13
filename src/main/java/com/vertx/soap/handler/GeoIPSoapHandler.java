package com.vertx.soap.handler;


import static com.vertx.soap.constants.Constants.RESPONSE_FAILED;
import static com.vertx.soap.util.JsonUtil.toJsonString;
import static com.vertx.soap.util.ResponseUtil.buildResponse;
import static com.vertx.soap.util.ResponseUtil.toRestResponse;

import com.vertx.soap.annotations.Get;
import com.vertx.soap.annotations.Service;
import com.vertx.soap.consumer.GeoIPServiceCallbackHandler;
import com.vertx.soap.consumer.webservicex.GeoIP;
import com.vertx.soap.consumer.webservicex.GetGeoIPResponse;
import com.vertx.soap.exception.ExceptionMapper;
import com.vertx.soap.models.RestErrorBuilder;
import com.vertx.soap.models.RestResponse;
import com.vertx.soap.service.GeoIPService;
import com.vertx.soap.service.IGeoIPService;

import io.vertx.core.json.JsonObject;
import io.vertx.rxjava.ext.web.RoutingContext;

@Service(version = "v1", uri = "/geoip")
public class GeoIPSoapHandler extends BaseHandler {
	protected final IGeoIPService service =  GeoIPService.INSTANCE;

	@Get("/:ip")
	public void search(final RoutingContext routingContext) {
		try {
			final String data = routingContext.request().getParam("ip");
			routingContext.vertx().<GeoIP>executeBlocking(blockingFuture -> {
				service.getCountryByGeoIP(data, new GeoIPServiceCallbackHandler() {
					
					@Override
					public void receiveResultgetGeoIP(GetGeoIPResponse result) {
						logger.info("Successfully executed getCountryByGeoIP");
						blockingFuture.complete(result.getGetGeoIPResult());
					}

					@Override
					public void receiveErrorgetGeoIP(Exception ex) {
						logger.error("Received error when executing getCountryByGeoIP ", ex);
						blockingFuture.fail(ex);
					}
				});
			}, false, result -> {
				toRestResponse(result, routingContext);
			});
		} catch (Exception ex) {
			logger.error("Error while executing getCountryByGeoIP ", ex);
			final RestResponse<RestErrorBuilder> response = buildResponse(500, RESPONSE_FAILED, ExceptionMapper.build(ex), true);
			routingContext.response().setStatusCode(500).end(toJsonString(response));
		}
	}
	
	@Override
	@Get("/status")
	public void handle(RoutingContext ctx) {
		ctx.response().end(new JsonObject().put("status", "Ok").toString());
	}
}