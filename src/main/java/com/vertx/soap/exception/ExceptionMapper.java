package com.vertx.soap.exception;

import java.net.UnknownHostException;

import org.apache.axis2.AxisFault;
import org.apache.commons.lang3.StringUtils;

import com.vertx.soap.models.RestErrorBuilder;

public class ExceptionMapper {

	public static RestErrorBuilder build(Exception ex) {
		if (ex instanceof RestException){
			RestException rx = (RestException) ex;
			final String message = rx.getCause() != null ? rx.getCause().getMessage() : rx.getMessage();
			return new RestErrorBuilder.Builder().setStatus(500).setMessage(message).build();
		}if (ex instanceof AxisFault) {
			AxisFault axf = (AxisFault) ex;
			String message = axf.getDetail() != null ? axf.getDetail().getText() : axf.getMessage();
			if(null != axf.getCause() && axf.getCause() instanceof UnknownHostException){
				message = StringUtils.join("UnknownHostException: ", axf.getCause().getMessage());
			}
			return new RestErrorBuilder.Builder().setStatus(500).setMessage(message).build();
		} else {
			return new RestErrorBuilder.Builder().setStatus(500).setMessage(ex.getMessage()).build();
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> T build(Throwable cause) {
		if (cause instanceof AxisFault) {
			AxisFault axf = (AxisFault) cause;
			final String message = axf.getMessage() != null ? axf.getMessage() : axf.getReason();
			return (T)new RestErrorBuilder.Builder().setStatus(500).setMessage(message).build();
		} else {
			return (T)new RestErrorBuilder.Builder().setStatus(500).setMessage(cause.getMessage()).build();
		}
	}
}