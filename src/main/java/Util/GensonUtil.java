package Util;

import com.owlike.genson.Genson;

public class GensonUtil {

	private Genson genson;

	public GensonUtil() {
		this.genson = new Genson();
	}

	public String getJSONForObject(Object obj) {
		return genson.serialize(obj);
	}

	public <T> T getObjectForJSON(String jsonString, Class<T> clazz) {
		
		return genson.deserialize(jsonString, clazz);
	}

}