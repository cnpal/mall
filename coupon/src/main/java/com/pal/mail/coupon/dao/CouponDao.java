package com.pal.mail.coupon.dao;

import com.pal.mail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author pal
 * @email cnbupt@gmail.com
 * @date 2020-06-26 11:35:32
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
