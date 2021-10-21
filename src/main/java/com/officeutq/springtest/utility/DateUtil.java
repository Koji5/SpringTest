package com.officeutq.springtest.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * java.util.Date, java.sql.Dataに関するユーティリティー
 * @author Koji Sakamoto
 *
 */
public class DateUtil {

	/**
	 * 文字列 "yyyy/MM/dd"
	 */
	public static final String yyyy_MM_dd = "yyyy/MM/dd";
	
	/**
	 * 第2引数のフォーマットで書かれた第1引数の文字列を、java.util.Date型に変換する
	 * 変換失敗でnullを返す
	 * @param source
	 * @param dateFormat
	 * @return
	 */
	public static java.util.Date parse(String source, String dateFormat) {
		java.util.Date date = new java.util.Date();;
		SimpleDateFormat sDateFormat = new SimpleDateFormat(dateFormat);
		try {
			date = sDateFormat.parse(source);
		} catch (ParseException e) {
			return null;
		}
		return date;
	}
	
	public static boolean isEmpty(java.util.Date date) {
		if (date == null) {
			return true;
		}
		return false;
	}
}
