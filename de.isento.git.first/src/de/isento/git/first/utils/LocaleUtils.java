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

	/**
	 * 
	 */
	public static String getCountryCompleteName(String countryAbbr){
		if (countryAbbr == null || countryAbbr.isEmpty()){
			throw new IllegalArgumentException("Bad parameters in getCountryNameByLocale method");
		}
		for (Locale locale: Locale.getAvailableLocales()){
			if (locale.getCountry().equals(countryAbbr)){
				return locale.getDisplayCountry();
			}
		}
		return "Unbekannt Land";
	}
	
}
