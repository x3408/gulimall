package com.x3408.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.x3408.common.utils.PageUtils;
import com.x3408.gulimall.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 
 *
 * @author x3408
 * @email x3408@hotmail.com
 * @date 2020-05-28 09:54:00
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

