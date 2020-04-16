package org.imooc.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

/**
 *	订单实体类.
 */

@JsonInclude(Include.NON_NULL)
@Data
public class Orders extends BaseBean{
	/**
	 * 订单id
	 */
	private Long id;
	/**
	 * 会员id
	 */
	private Long memberId;
	/**
	 * 商品id
	 */
	private Long businessId;
	/**
	 * 订单数量
	 */
	private Integer num;
	/**
	 * 评论状态
	 */
	private Integer commentState;
	/**
	 * 订单价格
	 */
	private Double price;
	/**
	 * 商户信息
	 */
	private Business business;
	/**
	 * 会员信息
	 */
	private Member member;
}