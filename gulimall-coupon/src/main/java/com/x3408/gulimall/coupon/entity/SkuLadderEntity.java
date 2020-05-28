package com.x3408.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author x3408
 * @email x3408@hotmail.com
 * @date 2020-05-28 09:54:00
 */
@Data
@TableName("sms_sku_ladder")
public class SkuLadderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long skuId;
	/**
	 * 
	 */
	private Integer fullCount;
	/**
	 * 
	 */
	private BigDecimal discount;
	/**
	 * 
	 */
	private BigDecimal price;
	/**
	 * 
	 */
	private Integer addOther;

}
