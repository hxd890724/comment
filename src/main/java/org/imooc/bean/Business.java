package org.imooc.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

import java.util.Date;


@JsonInclude(Include.NON_NULL)
@Data
public class Business extends BaseBean {

    /**
     * 商户id
     */
    private Long id;
    /**
     * 文件名称
     */
    private String imgFileName;
    /**
     * 标题
     */
    private String title;
    /**
     * 副标题
     */
    private String subtitle;
    /**
     * 商品价格
     */
    private Double price;
    /**
     * 距离商户多远
     */
    private Integer distance;
    /**
     * 已售数量
     */
    private Integer number;
    /**
     * 商户描述
     */
    private String desc;
    /**
     * 商户所在城市
     */
    private String city;
    /**
     * 商户种类
     */
    private String category;
    /**
     * 评论星星总数
     */
    private Long starTotalNum;
    /**
     * 评论总次数
     */
    private Long commentTotalNum;
    /**
     * 创建时间
     */
    private Date createTime;
    
    private Dic cityDic;
    private Dic categoryDic;
}