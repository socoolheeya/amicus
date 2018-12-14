package com.amicus.util;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

public class CommandMap {
	
	private Map<String, Object> map = new LinkedHashMap<String, Object>();
	
	public CommandMap() {}
	
	public CommandMap(HttpServletRequest request) {
		
	}
	
	public Object get(String key) {
		return map.get(key);
	}
	
	public void put(String key, Object value) {
		map.put(key, value);
	}
	
	public Object remove(String key) {
		return map.remove(key);
	}
	
	public boolean containsKey(String key) {
		return map.containsKey(key);
	}
	
	public boolean containsValue(Object value) {
		return map.containsValue(value);
	}
	
	public void clear() {
		map.clear();
	}
	
	public Set<Entry<String, Object>> entrySet() {
		return map.entrySet();
	}
	
	public Set<String> keySet() {
		return map.keySet();
	}
	
	public boolean isEmpty() {
		return map.isEmpty();
	}
	
	public void putAll(Map<? extends String, ? extends Object> m) {
		map.putAll(m);
	}
	
	public Map<String, Object> getMap() {
		return map;
	}
	
	public String toString() {
		StringBuilder b = new StringBuilder();
		for(String key : keySet()) {
			Object obj = get(key);
			b.append(key).append(" : ").append(obj.toString()).append(", ");
		}
		return b.toString();
	}
}
