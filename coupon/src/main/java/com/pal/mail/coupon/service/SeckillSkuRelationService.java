package com.pal.mail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pal.common.utils.PageUtils;
import com.pal.mail.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author pal
 * @email cnbupt@gmail.com
 * @date 2020-06-26 11:35:32
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

