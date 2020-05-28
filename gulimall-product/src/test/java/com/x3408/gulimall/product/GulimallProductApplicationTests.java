package com.x3408.gulimall.product;

import com.x3408.gulimall.product.entity.BrandEntity;
import com.x3408.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("测试描述");
        brandEntity.setName("测试");

        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
