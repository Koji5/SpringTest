package com.officeutq.springtest.utility;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.BigDecimalConverter;
import org.apache.commons.beanutils.converters.BooleanConverter;
import org.apache.commons.beanutils.converters.ByteConverter;
import org.apache.commons.beanutils.converters.CharacterConverter;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DoubleConverter;
import org.apache.commons.beanutils.converters.FloatConverter;
import org.apache.commons.beanutils.converters.IntegerConverter;
import org.apache.commons.beanutils.converters.LongConverter;
import org.apache.commons.beanutils.converters.ShortConverter;

/**
 * BeanUtil
 * 
 * org.apache.commons.beanutils.BeanUtilsとの相違点
 * 　null値もそのままコピーされる
 * 　try-catchの実装
 * 
 * 注意点
 * 　シャローコピーである
 * 　型が一致しなくてもコピーされる
 * 
 * @author Koji Sakamoto
 *
 */
public class BeanUtil extends BeanUtils {

	private BeanUtil() {
	}

	public static void copyProperties(Object dest, Object orig) {
		if (dest != null && orig != null) {
			try {
				ConvertUtils.register(new DateConverter(null), Date.class);
				ConvertUtils.register(null, Timestamp.class);
				ConvertUtils.register(new BooleanConverter(null), Boolean.class);
				ConvertUtils.register(new CharacterConverter(null), Character.class);
				ConvertUtils.register(new ByteConverter(null), Byte.class);
				ConvertUtils.register(new ShortConverter(null), Short.class);
				ConvertUtils.register(new IntegerConverter(null), Integer.class);
				ConvertUtils.register(new LongConverter(null), Long.class);
				ConvertUtils.register(new FloatConverter(null), Float.class);
				ConvertUtils.register(new DoubleConverter(null), Double.class);
				ConvertUtils.register(new BigDecimalConverter(null), BigDecimal.class);
				BeanUtils.copyProperties(dest, orig);
			} catch (IllegalAccessException | InvocationTargetException e) {
				// TODO 各アプリのエラー処理
			}
		}
	}
}
