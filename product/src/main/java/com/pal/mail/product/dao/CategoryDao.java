package com.pal.mail.product.dao;

import com.pal.mail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author pal
 * @email cnbupt@gmail.com
 * @date 2020-07-01 20:27:41
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
