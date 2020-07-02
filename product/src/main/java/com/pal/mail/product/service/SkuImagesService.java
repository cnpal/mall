package com.pal.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pal.common.utils.PageUtils;
import com.pal.mail.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author pal
 * @email cnbupt@gmail.com
 * @date 2020-07-01 20:27:41
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

