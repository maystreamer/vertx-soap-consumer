package com.vertx.soap.service;

import java.rmi.RemoteException;

import com.vertx.soap.consumer.GeoIPServiceCallbackHandler;
import com.vertx.soap.consumer.GeoIPServiceStub;
import com.vertx.soap.consumer.webservicex.GetGeoIP;

public enum GeoIPService implements IGeoIPService {
	INSTANCE;

	protected static final String targetEndpoint = "http://www.webservicex.net/geoipservice.asmx";
	
	@Override
	public void getCountryByGeoIP(final String ipAddress, final GeoIPServiceCallbackHandler handler) {
		try {
			final com.vertx.soap.consumer.GeoIPService service = new GeoIPServiceStub(targetEndpoint);
			service.startgetGeoIP(buildGeoIP(ipAddress), handler);
		} catch (RemoteException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
	
	protected GetGeoIP buildGeoIP(final String ipAddress){
		GetGeoIP geoIP = new GetGeoIP();
		geoIP.setIPAddress(ipAddress);
		return geoIP;
	}
}