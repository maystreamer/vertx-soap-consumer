
/**
 * GeoIPServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.5  Built on : May 06, 2017 (03:45:26 BST)
 */

package com.vertx.soap.consumer;

/**
 * GeoIPServiceCallbackHandler Callback class, Users can extend this class and
 * implement their own receiveResult and receiveError methods.
 */
public abstract class GeoIPServiceCallbackHandler {

	protected Object clientData;

	/**
	 * User can pass in any object that needs to be accessed once the
	 * NonBlocking Web service call is finished and appropriate method of this
	 * CallBack is called.
	 * 
	 * @param clientData
	 *            Object mechanism by which the user can pass in user data that
	 *            will be avilable at the time this callback is called.
	 */
	public GeoIPServiceCallbackHandler(Object clientData) {
		this.clientData = clientData;
	}

	/**
	 * Please use this constructor if you don't want to set any clientData
	 */
	public GeoIPServiceCallbackHandler() {
		this.clientData = null;
	}

	/**
	 * Get the client data
	 */

	public Object getClientData() {
		return clientData;
	}

	/**
	 * auto generated Axis2 call back method for getGeoIP method override this
	 * method for handling normal response from getGeoIP operation
	 */
	public void receiveResultgetGeoIP(com.vertx.soap.consumer.webservicex.GetGeoIPResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from getGeoIP operation
	 */
	public void receiveErrorgetGeoIP(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getGeoIPContext method override
	 * this method for handling normal response from getGeoIPContext operation
	 */
	public void receiveResultgetGeoIPContext(com.vertx.soap.consumer.webservicex.GetGeoIPContextResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from getGeoIPContext operation
	 */
	public void receiveErrorgetGeoIPContext(java.lang.Exception e) {
	}

}
