package com.officeutq.springtest.utility;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Ajax通信に関するユーティリティー
 * @author Koji Sakamoto
 *
 * @param <T>
 */
public class AjaxUtil<T> {
	
	  private T t;
	  
 	  public void set(T arg){
	    this.t = arg;
	  }
	  
	  public T get(){
	    return this.t;
	  }

	/**
     * 引数の文字列をエンコードする
     * @param data 任意の文字列
     * @return エンコード後の文字列
     */
	public static String encode(String data) {
        // 引数がnullまたは空文字の場合は、その値を返す
        if(StringUtils.isEmpty(data)){
            return data;
        }
        String retVal = null;
        try{
            retVal = URLEncoder.encode(data, "UTF-8");
        }catch (UnsupportedEncodingException e) {
            System.err.println(e);
        }
        return retVal;
    }
	
	/**
	 * 引数の文字列をデコードする
	 * @param data
	 * @return
	 */
	public static String decode(String data) {
        if(StringUtils.isEmpty(data)){
            return data;
        }
        String retVal = null;
        try{
            retVal = URLDecoder.decode(data, "UTF-8");
        }catch (UnsupportedEncodingException e) {
            System.err.println(e);
        }
        return retVal;
	}

    /**
     * 引数のオブジェクトをJSON文字列に変換する
     * @param userDataList UserDataオブジェクトのリスト
     * @return 変換後JSON文字列
     */
    public static <T> String getJson(T value){
        String retVal = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            retVal = objectMapper.writeValueAsString(value);
        } catch (JsonProcessingException e) {
        	e.printStackTrace();
        }
        return retVal;
    }
    
    /**
     * JSON文字列を引数の型のオブジェクトに変換する
     * @param <T>
     * @param value
     * @param valueType
     * @return
     */
    public static <T> T readJson(String value, Class<T> valueType){
    	ObjectMapper mapper = new ObjectMapper();
    	T retVal = null;
		try {
			retVal = mapper.readValue(value, valueType);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
        return retVal;
    }
    
}
