package com.pc.utils;

import java.util.Date;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;

/**
 * Bean封装工具类
 * 
 * @author Switch
 * @data 2016年10月11日
 * @version V1.0
 */
public class MyBeanUtils {
	public static <T> T populate(Class<T> beanClass, Map<String, String[]> props) throws Exception {
		// 使用反射创建实例
		T bean = beanClass.newInstance();
		// 创建BeanUtils提供的时间转换器
		DateConverter dateConverter = new DateConverter();
		// 设置转换格式
		dateConverter.setPatterns(new String[] { "yyyy-MM-dd", "yyyy/MM/dd", "yyyyMMdd" });
		// 注册转换器
		ConvertUtils.register(dateConverter, Date.class);
		// 封装数据
		BeanUtils.populate(bean, props);
		return bean;
	}
}
