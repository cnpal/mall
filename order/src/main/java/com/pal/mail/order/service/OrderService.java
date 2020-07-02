package com.pal.mail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pal.common.utils.PageUtils;
import com.pal.mail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author pal
 * @email cnbupt@gmail.com
 * @date 2020-07-01 21:51:55
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

