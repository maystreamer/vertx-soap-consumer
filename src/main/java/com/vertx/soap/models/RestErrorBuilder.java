package com.vertx.soap.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = RestErrorBuilder.Builder.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestErrorBuilder {
	private final Integer status;
	private final String error;
	private final String message;
	private final String timeStamp;
	private final String trace;

	private RestErrorBuilder(Builder builder) {
		this.status = builder.status;
		this.error = builder.error;
		this.message = builder.message;
		this.timeStamp = builder.timeStamp;
		this.trace = builder.trace;
	}

	@JsonPOJOBuilder(buildMethodName = "build", withPrefix = "set")
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Builder {
		private Integer status;
		private String error;
		private String message;
		private String timeStamp;
		private String trace;

		public Builder() {
		}

		public Builder setStatus(Integer status) {
			this.status = status;
			return this;
		}

		public Builder setError(String error) {
			this.error = error;
			return this;
		}

		public Builder setMessage(String message) {
			this.message = message;
			return this;
		}

		public Builder setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
			return this;
		}

		public Builder setTrace(String trace) {
			this.trace = trace;
			return this;
		}

		public RestErrorBuilder build() {
			return new RestErrorBuilder(this);
		}
	}

	public Integer getStatus() {
		return status;
	}

	public String getError() {
		return error;
	}

	public String getMessage() {
		return message;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public String getTrace() {
		return trace;
	}
}