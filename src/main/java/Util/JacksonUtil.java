package Util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonUtil {

	private  ObjectMapper jackson;

	public JacksonUtil() {
		this.jackson = new ObjectMapper();
	}

	public String getJSONForObject(Object obj) {
		return jackson.writeValueAsString(obj);
	}

	public <T> T getObjectForJSON(String jsonString, Class<T> clazz) {
		
		return jackson.readValue(jsonString, clazz);
	}

}