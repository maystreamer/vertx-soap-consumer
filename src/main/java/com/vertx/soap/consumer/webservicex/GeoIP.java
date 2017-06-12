
/**
 * GeoIP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.5  Built on : May 06, 2017 (03:45:50 BST)
 */

package com.vertx.soap.consumer.webservicex;

/**
 * GeoIP bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class GeoIP implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name = GeoIP
	 * Namespace URI = http://www.webservicex.net/ Namespace Prefix = ns1
	 */

	/**
	 * field for ReturnCode
	 */

	protected int localReturnCode;

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getReturnCode() {
		return localReturnCode;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ReturnCode
	 */
	public void setReturnCode(int param) {

		this.localReturnCode = param;

	}

	/**
	 * field for IP
	 */

	protected java.lang.String localIP;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localIPTracker = false;

	public boolean isIPSpecified() {
		return localIPTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getIP() {
		return localIP;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            IP
	 */
	public void setIP(java.lang.String param) {
		localIPTracker = param != null;

		this.localIP = param;

	}

	/**
	 * field for ReturnCodeDetails
	 */

	protected java.lang.String localReturnCodeDetails;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localReturnCodeDetailsTracker = false;

	public boolean isReturnCodeDetailsSpecified() {
		return localReturnCodeDetailsTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getReturnCodeDetails() {
		return localReturnCodeDetails;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ReturnCodeDetails
	 */
	public void setReturnCodeDetails(java.lang.String param) {
		localReturnCodeDetailsTracker = param != null;

		this.localReturnCodeDetails = param;

	}

	/**
	 * field for CountryName
	 */

	protected java.lang.String localCountryName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localCountryNameTracker = false;

	public boolean isCountryNameSpecified() {
		return localCountryNameTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getCountryName() {
		return localCountryName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            CountryName
	 */
	public void setCountryName(java.lang.String param) {
		localCountryNameTracker = param != null;

		this.localCountryName = param;

	}

	/**
	 * field for CountryCode
	 */

	protected java.lang.String localCountryCode;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localCountryCodeTracker = false;

	public boolean isCountryCodeSpecified() {
		return localCountryCodeTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getCountryCode() {
		return localCountryCode;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            CountryCode
	 */
	public void setCountryCode(java.lang.String param) {
		localCountryCodeTracker = param != null;

		this.localCountryCode = param;

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

		return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, parentQName));

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
			boolean serializeType)
			throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

		java.lang.String prefix = null;
		java.lang.String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

		if (serializeType) {

			java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://www.webservicex.net/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":GeoIP",
						xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "GeoIP", xmlWriter);
			}

		}

		namespace = "http://www.webservicex.net/";
		writeStartElement(null, namespace, "ReturnCode", xmlWriter);

		if (localReturnCode == java.lang.Integer.MIN_VALUE) {

			throw new org.apache.axis2.databinding.ADBException("ReturnCode cannot be null!!");

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCode));
		}

		xmlWriter.writeEndElement();
		if (localIPTracker) {
			namespace = "http://www.webservicex.net/";
			writeStartElement(null, namespace, "IP", xmlWriter);

			if (localIP == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("IP cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localIP);

			}

			xmlWriter.writeEndElement();
		}
		if (localReturnCodeDetailsTracker) {
			namespace = "http://www.webservicex.net/";
			writeStartElement(null, namespace, "ReturnCodeDetails", xmlWriter);

			if (localReturnCodeDetails == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("ReturnCodeDetails cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localReturnCodeDetails);

			}

			xmlWriter.writeEndElement();
		}
		if (localCountryNameTracker) {
			namespace = "http://www.webservicex.net/";
			writeStartElement(null, namespace, "CountryName", xmlWriter);

			if (localCountryName == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("CountryName cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localCountryName);

			}

			xmlWriter.writeEndElement();
		}
		if (localCountryCodeTracker) {
			namespace = "http://www.webservicex.net/";
			writeStartElement(null, namespace, "CountryCode", xmlWriter);

			if (localCountryCode == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("CountryCode cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localCountryCode);

			}

			xmlWriter.writeEndElement();
		}
		xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://www.webservicex.net/")) {
			return "ns1";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
		if (writerPrefix != null) {
			xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
		} else {
			if (namespace.length() == 0) {
				prefix = "";
			} else if (prefix == null) {
				prefix = generatePrefix(namespace);
			}

			xmlWriter.writeStartElement(prefix, localPart, namespace);
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
		if (writerPrefix != null) {
			xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
		} else {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
			xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
			javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		java.lang.String attributeNamespace = qname.getNamespaceURI();
		java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}
		java.lang.String attributeValue;
		if (attributePrefix.trim().length() > 0) {
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else {
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attributeValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
		}
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(
						prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not
			// possible to write any
			// namespace data after writing the charactor data
			java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
			java.lang.String namespaceURI = null;
			java.lang.String prefix = null;

			for (int i = 0; i < qnames.length; i++) {
				if (i > 0) {
					stringToWrite.append(" ");
				}
				namespaceURI = qnames[i].getNamespaceURI();
				if (namespaceURI != null) {
					prefix = xmlWriter.getPrefix(namespaceURI);
					if ((prefix == null) || (prefix.length() == 0)) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0) {
						stringToWrite.append(prefix).append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				} else {
					stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
				}
			}
			xmlWriter.writeCharacters(stringToWrite.toString());
		}

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String prefix = xmlWriter.getPrefix(namespace);
		if (prefix == null) {
			prefix = generatePrefix(namespace);
			javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
			while (true) {
				java.lang.String uri = nsContext.getNamespaceURI(prefix);
				if (uri == null || uri.length() == 0) {
					break;
				}
				prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		return prefix;
	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {
		private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

		/**
		 * static method to create the object Precondition: If this object is an
		 * element, the current or next start element starts this object and any
		 * intervening reader events are ignorable If this object is not an
		 * element, it is a complex type and the reader is at the event just
		 * after the outer start element Postcondition: If this object is an
		 * element, the reader is positioned at its end element If this object
		 * is a complex type, the reader is positioned at the end element of its
		 * outer element
		 */
		public static GeoIP parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			GeoIP object = new GeoIP();

			int event;
			javax.xml.namespace.QName currentQName = null;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				currentQName = reader.getName();

				if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					java.lang.String fullTypeName = reader
							.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
					if (fullTypeName != null) {
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix == null ? "" : nsPrefix;

						java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

						if (!"GeoIP".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (GeoIP) com.vertx.soap.consumer.webservicex.ExtensionMapper.getTypeObject(nsUri,
									type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.webservicex.net/", "ReturnCode")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("", "ReturnCode").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "ReturnCode" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setReturnCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// 1 - A start element we are not expecting indicates an
					// invalid parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.webservicex.net/", "IP").equals(reader.getName())
						|| new javax.xml.namespace.QName("", "IP").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "IP" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setIP(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.webservicex.net/", "ReturnCodeDetails")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("", "ReturnCodeDetails").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "ReturnCodeDetails" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setReturnCodeDetails(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.webservicex.net/", "CountryName")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("", "CountryName").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "CountryName" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setCountryName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.webservicex.net/", "CountryCode")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("", "CountryCode").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "CountryCode" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setCountryCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// 2 - A start element we are not expecting indicates a
					// trailing invalid property

					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}
