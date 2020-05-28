package com.x3408.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author x3408
 * @email x3408@hotmail.com
 * @date 2020-05-28 10:01:19
 */
@Data
@TableName("ums_member_receive_address")
public class MemberReceiveAddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String phone;
	/**
	 * 
	 */
	private String postCode;
	/**
	 * ʡ
	 */
	private String province;
	/**
	 * 
	 */
	private String city;
	/**
	 * 
	 */
	private String region;
	/**
	 * 
	 */
	private String detailAddress;
	/**
	 * ʡ
	 */
	private String areacode;
	/**
	 * 
	 */
	private Integer defaultStatus;

}
