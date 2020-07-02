package com.pal.mail.order.dao;

import com.pal.mail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author pal
 * @email cnbupt@gmail.com
 * @date 2020-07-01 21:51:55
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
