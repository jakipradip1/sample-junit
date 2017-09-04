package com.cubic.util;

public class NameUtil {
	public String getFormattedName(final String fName, final String lName) {
		String result = "";

		if (fName != null) {
			result = fName + " ";
		}

		if (lName != null) {
			result = result + lName;
		}
		return result.trim();
	}
}
