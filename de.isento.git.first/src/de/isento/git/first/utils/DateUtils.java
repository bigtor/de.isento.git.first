package de.isento.git.first.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Klasse mit Datumumgang methode
 */
public class DateUtils {

	private static final String DATE_TIME_FORMAT = "DD.MM.YYYY";

	public static String formatDateAsString(Date date){
		if (date == null) {
			throw new IllegalArgumentException("Bad parameters in formatDateAsString");
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_TIME_FORMAT);
		
		return dateFormat.format(date);
	}
	
}
