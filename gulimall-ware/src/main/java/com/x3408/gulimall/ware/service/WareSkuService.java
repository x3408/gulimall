package com.x3408.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.x3408.common.utils.PageUtils;
import com.x3408.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 
 *
 * @author x3408
 * @email x3408@hotmail.com
 * @date 2020-05-28 10:08:02
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

