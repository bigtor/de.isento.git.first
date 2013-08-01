package de.isento.git.first.utils;

import java.util.Date;
import java.util.Locale;

/**
 * Nutzbarkeit klasse
 */
public class HelloWorldUtils {

	/**
	 * Erstellt ein Hallo Welt String
	 */
	public static String sayHello(String benutzer, String language) {
		return sayHello(benutzer, true, language);
	}
	
	/**
	 * Erstellt ein Hallo Welt String
	 */
	public static String sayHello(String benutzer, boolean showDate, String language) {
		String salute = "Hallo " + benutzer + "!!";
		if (showDate) {
			salute+=getCountryAndDate(language);
		}
		return salute;
	}
	
	/**
	 * 
	 */
	public static String getCountryAndDate(){
		return getCountryAndDate(Locale.GERMANY.getCountry());
	}
	
	/**
	 * Erstellt ein String mit Datum und Land (Locale) für diese Maschine 
	 */
	public static String getCountryAndDate(String countryAbbr){
		Date date = new Date();
		return "Datum [" + DateUtils.formatDateAsString(date) + "], Land [" + LocaleUtils.getCountryCompleteName(countryAbbr) + "]";
	}
}
