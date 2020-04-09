package org.imooc.bean;

import lombok.Data;

/**
 * 数据字典
 */
@Data
public class Dic {
    /**
     * 类型
     */
    private String type;
    /**
     * 代码
     */
    private String code;
    /**
     * 代码对应的翻译
     */
    private String name;
    /**
     * 权重
     */
    private Integer weight;
}