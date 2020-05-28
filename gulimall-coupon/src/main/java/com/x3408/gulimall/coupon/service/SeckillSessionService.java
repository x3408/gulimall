package com.x3408.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.x3408.common.utils.PageUtils;
import com.x3408.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 
 *
 * @author x3408
 * @email x3408@hotmail.com
 * @date 2020-05-28 09:54:00
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

