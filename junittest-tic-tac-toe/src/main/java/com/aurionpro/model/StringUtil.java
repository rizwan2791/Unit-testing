package com.aurionpro.model;

public class StringUtil {
	public String truncateAInFirst2Place(String str) {
		if(str.substring(0, 2).equalsIgnoreCase("AA")) {
			return str.substring(2);
		} else if (str.substring(1, 2).equalsIgnoreCase("A")) {
			return str.substring(0, 1) + str.substring(2);
		} else if (str.substring(0, 1).equalsIgnoreCase("A")) {
			return str.substring(1);
		} else
			return str;
	}

	public boolean firstAndLastTWoCharEqual(String str) {
		if (str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() - 2, str.length()))) {
			return true;
		} else
			return false;
	}

}