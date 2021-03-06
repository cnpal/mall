package com.pal.mail.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pal.mail.product.entity.BrandEntity;
import com.pal.mail.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author pal
 * @Date Created in 2020/6/26 11:02
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTest {

    @Autowired
    BrandService brandService;
    @Test
    public void save(){
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

//        brandEntity.setBrandId(1l);
//        brandEntity.setDescript("任正非");
//        brandService.updateById(brandEntity);


        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1l));
        list.forEach((item)->{
            System.out.println(item);
        });
    }
}
