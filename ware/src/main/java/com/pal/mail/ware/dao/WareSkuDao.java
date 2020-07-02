package com.pal.mail.ware.dao;

import com.pal.mail.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author pal
 * @email cnbupt@gmail.com
 * @date 2020-07-01 22:03:18
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
