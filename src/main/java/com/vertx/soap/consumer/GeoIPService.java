
/**
 * GeoIPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.5  Built on : May 06, 2017 (03:45:26 BST)
 */

package com.vertx.soap.consumer;

/*
 *  GeoIPService java interface
 */

public interface GeoIPService {

	/**
	 * Auto generated method signature for Asynchronous Invocations GeoIPService
	 * - GetGeoIP enables you to easily look up countries by IP addresses
	 * 
	 * @param getGeoIP0
	 * 
	 */
	public void startgetGeoIP(

			com.vertx.soap.consumer.webservicex.GetGeoIP getGeoIP0,

			final com.vertx.soap.consumer.GeoIPServiceCallbackHandler callback)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations GeoIPService
	 * - GetGeoIPContext enables you to easily look up countries by Context
	 * 
	 * @param getGeoIPContext2
	 * 
	 */
	public void startgetGeoIPContext(

			com.vertx.soap.consumer.webservicex.GetGeoIPContext getGeoIPContext2,

			final com.vertx.soap.consumer.GeoIPServiceCallbackHandler callback)

			throws java.rmi.RemoteException;

	//
}
