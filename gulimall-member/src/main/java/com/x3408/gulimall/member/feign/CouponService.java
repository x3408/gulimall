package com.x3408.gulimall.member.feign;

import com.x3408.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")     //寻找哪个服务
public interface CouponService {

    @RequestMapping("/coupon/coupon/member/list")       //哪个方法
    public R membercoupons();
}
