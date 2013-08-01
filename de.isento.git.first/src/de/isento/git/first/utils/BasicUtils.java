package de.isento.git.first.utils;

import java.util.Date;
import java.util.Locale;

/**
 * Nutzbarkeit klasse
 */
public class BasicUtils {

	/**
	 * Ohne Parameter Bauer
	 */
	public BasicUtils(){
		
	}
	
	/**
	 * Erstellt ein Hallo Welt String
	 */
	public String sayHello(String benutzer) {
		return sayHello(benutzer, true);
	}
	
	/**
	 * Erstellt ein Hallo Welt String
	 */
	public String sayHello(String benutzer, boolean showDate) {
		String salute = "Hallo " + benutzer + "!!";
		if (showDate) {
			salute+=getCountryAndDate();
		}
		return salute;
	}
	
	/**
	 * Erstellt ein String mit Datum und Land (Locale) für diese Maschine 
	 */
	public String getCountryAndDate(){
		Date date = new Date();
		return "Datum [" + DateUtils.formatDateAsString(date) + "], Land [" + LocaleUtils.getLocaleCountryName() + "]";
	}
}
