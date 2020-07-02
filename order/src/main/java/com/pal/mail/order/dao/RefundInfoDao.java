package com.pal.mail.order.dao;

import com.pal.mail.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author pal
 * @email cnbupt@gmail.com
 * @date 2020-07-01 21:51:54
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
