package de.isento.git.first.utils;

import java.util.Locale;

/**
 * 
 */
public class LocaleUtils {

	/**
	 * 
	 */
	public static String getLocaleCountryName() {
		return Locale.getDefault().getDisplayCountry();
	}
	
}
