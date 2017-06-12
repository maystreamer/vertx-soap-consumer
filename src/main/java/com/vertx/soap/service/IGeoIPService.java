package com.vertx.soap.service;

import com.vertx.soap.consumer.GeoIPServiceCallbackHandler;

public interface IGeoIPService extends IBaseService {
	public void getCountryByGeoIP(final String ipAddress, final GeoIPServiceCallbackHandler handler);
}
