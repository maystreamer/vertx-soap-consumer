package com.vertx.soap.util;

import java.util.Map;

import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;

public final class JsonUtil {

	public static <T> String toJsonString(final T object) {
		return Json.encode(object);
	}

	@SuppressWarnings("unchecked")
	public static <T> JsonObject toJsonObject(T object) {
		return new JsonObject((Map<String, Object>) Json.mapper.convertValue(object, Map.class));
	}
}
