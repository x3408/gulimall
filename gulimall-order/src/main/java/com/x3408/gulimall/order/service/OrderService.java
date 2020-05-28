package com.x3408.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.x3408.common.utils.PageUtils;
import com.x3408.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author x3408
 * @email x3408@hotmail.com
 * @date 2020-05-28 10:06:30
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

