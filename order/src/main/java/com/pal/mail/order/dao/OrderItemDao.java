package com.pal.mail.order.dao;

import com.pal.mail.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author pal
 * @email cnbupt@gmail.com
 * @date 2020-07-01 21:51:55
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
