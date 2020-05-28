package com.x3408.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.x3408.common.utils.PageUtils;
import com.x3408.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * Ʒ
 *
 * @author x3408
 * @email x3408@hotmail.com
 * @date 2020-05-22 13:43:59
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

