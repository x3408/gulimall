package com.x3408.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.x3408.common.utils.PageUtils;
import com.x3408.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author x3408
 * @email x3408@hotmail.com
 * @date 2020-05-28 10:01:19
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

