package com.x3408.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.x3408.common.utils.PageUtils;
import com.x3408.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu
 *
 * @author x3408
 * @email x3408@hotmail.com
 * @date 2020-05-22 13:43:59
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

