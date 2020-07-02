package com.pal.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pal.common.utils.PageUtils;
import com.pal.mail.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author pal
 * @email cnbupt@gmail.com
 * @date 2020-07-01 20:27:41
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

