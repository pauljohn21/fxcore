package com.moola.fx.utils;

import com.google.common.collect.Maps;
import java.util.Map;

public class PropertiesUtils {
	private static PropertiesLoader loader = new PropertiesLoader(new String[]{"application.yml"});
	private static Map<String, String> map = Maps.newHashMap();

	public PropertiesUtils() {
	}

	public static String getConfig(String key) {
		String value = (String)map.get(key);
		if (value == null) {
			value = loader.getProperty(key);
			map.put(key, value != null ? value : "");
		}

		return value;
	}
}
