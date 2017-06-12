package com.vertx.soap.exception;

public class RestException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5154333281879895L;
	private int statusCode;

    public RestException() {
        super();
        statusCode = 500;
    }

    public RestException(int code) {
        super();
        statusCode = code;
    }

    public RestException(String message) {
        super(message);
        statusCode = 500;
    }

    public RestException(String message, Throwable cause) {
        super(message, cause);
        statusCode = 500;
    }

    public RestException(String message, int code) {
        super(message);
        statusCode = code;
    }

    public RestException(Throwable cause, int code) {
        super(cause);
        statusCode = code;
    }

    public RestException(String message, Throwable cause, int code) {
        super(message, cause);
        statusCode = code;
    }

    public int getStatusCode() {
        return statusCode;
    }
}