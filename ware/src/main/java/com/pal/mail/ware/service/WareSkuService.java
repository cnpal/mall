package com.pal.mail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pal.common.utils.PageUtils;
import com.pal.mail.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author pal
 * @email cnbupt@gmail.com
 * @date 2020-07-01 22:03:18
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

