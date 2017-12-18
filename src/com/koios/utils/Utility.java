package com.koios.utils;

import java.util.regex.Pattern;

public class Utility {
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNullOrEmpty(String str) {
		return null == str || "null".equals(str.trim()) || "".equals(str.trim());
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNum(String str) {
		Pattern pattern = Pattern.compile("^[\\d]+$");
		return pattern.matcher(str).matches();
	}
	
	

}
