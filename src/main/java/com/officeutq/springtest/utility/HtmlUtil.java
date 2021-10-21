package com.officeutq.springtest.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * HTMLで使用するタグに関するユーティリティー
 * @author Koji Sakamoto
 *
 */
public class HtmlUtil {

	/**
	 * タグで囲まれた文字列を抽出する
	 * @param htmlStr
	 * @param tagName
	 * @return
	 */
	public static String getTagValue(String htmlStr, String tagName) {
		String ptn = "<" + tagName + ">(.+?)</" + tagName + ">";
		Pattern pattern = Pattern.compile(ptn, Pattern.DOTALL);
		Matcher matcher = pattern.matcher(htmlStr);
		matcher.find();
		return matcher.group(1);
	}
	
	/**
	 * タグで囲まれた文字列を抽出する(複数)
	 * @param htmlStr
	 * @param tagName
	 * @return
	 */
	public static List<String> getTagValues(String htmlStr, String tagName) {
		String ptn = "<" + tagName + ">(.+?)</" + tagName + ">";
		Pattern tagRegex = Pattern.compile(ptn, Pattern.DOTALL);
	    List<String> tagValues = new ArrayList<String>();
	    Matcher matcher = tagRegex.matcher(htmlStr);
	    while (matcher.find()) {
	        tagValues.add(matcher.group(1));
	    }
	    return tagValues;
	}
	
	/**
	 * セキュリティ上問題のある文字の変換を行う。
	 * @param htmlStr
	 * @return
	 */
	public static String escapeHtml(String htmlStr) {
		if(htmlStr == null) {
			return null;
		}
		return htmlStr
				.replace("&", "&amp;")
				.replace("<", "&lt;")
				.replace(">", "&gt;")
				.replace("\"", "&#034;")
				.replace("'", "&#039;");
	}
	
	/**
	 * タグで囲まれた範囲の、セキュリティ上問題のある文字の変換を行う。
	 * @param htmlStr
	 * @param tagName
	 * @return
	 */
	public static String escapeTagValue(String htmlStr, String tagName) {
		unescapeHtml(htmlStr);

		List<String> tagValues = getTagValues(htmlStr, tagName);
		if (tagValues == null) {
			return htmlStr;
		}
		for (String tagValue : tagValues) {
			htmlStr = htmlStr.replace(tagValue, escapeHtml(tagValue));
		}
	    return htmlStr;
	}
	
	public static String unescapeHtml(String htmlStr) {
		return htmlStr
				.replace("&amp;", "&")
				.replace("&lt;", "<")
				.replace("&gt;", ">")
				.replace("&#034;", "\"")
				.replace("&#039;", "'");
	}
}
