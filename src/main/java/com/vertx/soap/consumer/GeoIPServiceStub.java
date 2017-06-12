
/**
 * GeoIPServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.5  Built on : May 06, 2017 (03:45:26 BST)
 */
package com.vertx.soap.consumer;

/*
*  GeoIPServiceStub java implementation
*/
@SuppressWarnings({"rawtypes", "unused"})
public class GeoIPServiceStub extends org.apache.axis2.client.Stub implements GeoIPService {
	protected org.apache.axis2.description.AxisOperation[] _operations;

	// hashmaps to keep the fault mapping
	private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
	private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	private java.util.HashMap faultMessageMap = new java.util.HashMap();

	private static int counter = 0;

	private static synchronized java.lang.String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}
		counter = counter + 1;
		return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
	}

	private void populateAxisService() throws org.apache.axis2.AxisFault {

		// creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService("GeoIPService" + getUniqueSuffix());
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[2];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.webservicex.net/", "getGeoIP"));
		_service.addOperation(__operation);

		_operations[0] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.webservicex.net/", "getGeoIPContext"));
		_service.addOperation(__operation);

		_operations[1] = __operation;

	}

	// populates the faults
	private void populateFaults() {

	}

	/**
	 * Constructor that takes in a configContext
	 */

	public GeoIPServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public GeoIPServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint, boolean useSeparateListener) throws org.apache.axis2.AxisFault {
		// To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

		_serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

		// Set the soap version
		_serviceClient.getOptions()
				.setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);

	}

	/**
	 * Default Constructor
	 */
	public GeoIPServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext)
			throws org.apache.axis2.AxisFault {

		this(configurationContext, "http://www.webservicex.net/geoipservice.asmx");

	}

	/**
	 * Default Constructor
	 */
	public GeoIPServiceStub() throws org.apache.axis2.AxisFault {

		this("http://www.webservicex.net/geoipservice.asmx");

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public GeoIPServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(null, targetEndpoint);
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations GeoIPService
	 * - GetGeoIP enables you to easily look up countries by IP addresses
	 * 
	 * @see com.vertx.soap.consumer.GeoIPService#startgetGeoIP
	 * @param getGeoIP4
	 * 
	 */
	public void startgetGeoIP(

			com.vertx.soap.consumer.webservicex.GetGeoIP getGeoIP4,

			final com.vertx.soap.consumer.GeoIPServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[0].getName());
		_operationClient.getOptions().setAction("http://www.webservicex.net/GetGeoIP");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getGeoIP4,
				optimizeContent(new javax.xml.namespace.QName("http://www.webservicex.net/", "getGeoIP")),
				new javax.xml.namespace.QName("http://www.webservicex.net/", "GetGeoIP"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.vertx.soap.consumer.webservicex.GetGeoIPResponse.class);
					callback.receiveResultgetGeoIP((com.vertx.soap.consumer.webservicex.GetGeoIPResponse) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetGeoIP(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetGeoIP"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetGeoIP"));
								java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetGeoIP"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorgetGeoIP(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorgetGeoIP(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorgetGeoIP(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorgetGeoIP(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorgetGeoIP(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorgetGeoIP(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorgetGeoIP(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorgetGeoIP(f);
							}
						} else {
							callback.receiveErrorgetGeoIP(f);
						}
					} else {
						callback.receiveErrorgetGeoIP(f);
					}
				} else {
					callback.receiveErrorgetGeoIP(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetGeoIP(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[0].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations GeoIPService
	 * - GetGeoIPContext enables you to easily look up countries by Context
	 * 
	 * @see com.vertx.soap.consumer.GeoIPService#startgetGeoIPContext
	 * @param getGeoIPContext6
	 * 
	 */
	public void startgetGeoIPContext(

			com.vertx.soap.consumer.webservicex.GetGeoIPContext getGeoIPContext6,

			final com.vertx.soap.consumer.GeoIPServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[1].getName());
		_operationClient.getOptions().setAction("http://www.webservicex.net/GetGeoIPContext");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getGeoIPContext6,
				optimizeContent(new javax.xml.namespace.QName("http://www.webservicex.net/", "getGeoIPContext")),
				new javax.xml.namespace.QName("http://www.webservicex.net/", "GetGeoIPContext"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.vertx.soap.consumer.webservicex.GetGeoIPContextResponse.class);
					callback.receiveResultgetGeoIPContext(
							(com.vertx.soap.consumer.webservicex.GetGeoIPContextResponse) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetGeoIPContext(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetGeoIPContext"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"GetGeoIPContext"));
								java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"GetGeoIPContext"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorgetGeoIPContext(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorgetGeoIPContext(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorgetGeoIPContext(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorgetGeoIPContext(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorgetGeoIPContext(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorgetGeoIPContext(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorgetGeoIPContext(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorgetGeoIPContext(f);
							}
						} else {
							callback.receiveErrorgetGeoIPContext(f);
						}
					} else {
						callback.receiveErrorgetGeoIPContext(f);
					}
				} else {
					callback.receiveErrorgetGeoIPContext(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetGeoIPContext(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[1].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	private javax.xml.namespace.QName[] opNameArray = null;

	private boolean optimizeContent(javax.xml.namespace.QName opName) {

		if (opNameArray == null) {
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;
			}
		}
		return false;
	}

	// http://www.webservicex.net/geoipservice.asmx
	private org.apache.axiom.om.OMElement toOM(com.vertx.soap.consumer.webservicex.GetGeoIP param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.vertx.soap.consumer.webservicex.GetGeoIP.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.vertx.soap.consumer.webservicex.GetGeoIPResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.vertx.soap.consumer.webservicex.GetGeoIPResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.vertx.soap.consumer.webservicex.GetGeoIPContext param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.vertx.soap.consumer.webservicex.GetGeoIPContext.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.vertx.soap.consumer.webservicex.GetGeoIPContextResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.vertx.soap.consumer.webservicex.GetGeoIPContextResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			com.vertx.soap.consumer.webservicex.GetGeoIP param, boolean optimizeContent,
			javax.xml.namespace.QName elementQName) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(com.vertx.soap.consumer.webservicex.GetGeoIP.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			com.vertx.soap.consumer.webservicex.GetGeoIPContext param, boolean optimizeContent,
			javax.xml.namespace.QName elementQName) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(com.vertx.soap.consumer.webservicex.GetGeoIPContext.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type)
			throws org.apache.axis2.AxisFault {

		try {

			if (com.vertx.soap.consumer.webservicex.GetGeoIP.class.equals(type)) {

				return com.vertx.soap.consumer.webservicex.GetGeoIP.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.vertx.soap.consumer.webservicex.GetGeoIPContext.class.equals(type)) {

				return com.vertx.soap.consumer.webservicex.GetGeoIPContext.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.vertx.soap.consumer.webservicex.GetGeoIPContextResponse.class.equals(type)) {

				return com.vertx.soap.consumer.webservicex.GetGeoIPContextResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.vertx.soap.consumer.webservicex.GetGeoIPResponse.class.equals(type)) {

				return com.vertx.soap.consumer.webservicex.GetGeoIPResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

}
