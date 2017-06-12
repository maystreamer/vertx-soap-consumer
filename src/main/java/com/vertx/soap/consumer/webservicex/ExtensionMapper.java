
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.5  Built on : May 06, 2017 (03:45:50 BST)
 */

package com.vertx.soap.consumer.webservicex;

/**
 * ExtensionMapper class
 */
public class ExtensionMapper {

	public static java.lang.Object getTypeObject(java.lang.String namespaceURI, java.lang.String typeName,
			javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {

		if ("http://www.webservicex.net/".equals(namespaceURI) && "GeoIP".equals(typeName)) {

			return com.vertx.soap.consumer.webservicex.GeoIP.Factory.parse(reader);

		}

		throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
	}

}
