package com.x3408.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.x3408.common.utils.PageUtils;
import com.x3408.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 
 *
 * @author x3408
 * @email x3408@hotmail.com
 * @date 2020-05-22 13:43:59
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

