package org.imooc.bean;

import lombok.Data;

import java.util.Date;

/**
 * 系统参数类.
 */
@Data
public class SysParam {
	/**
	 * 参数key值
	 */
	private String paramKey;
	/**
	 * 参数value值
	 */
	private Date paramValue;
	/**
	 * 参数描述
	 */
	private String paramDesc;
}