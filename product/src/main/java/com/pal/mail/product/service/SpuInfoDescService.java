package com.pal.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pal.common.utils.PageUtils;
import com.pal.mail.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author pal
 * @email cnbupt@gmail.com
 * @date 2020-07-01 20:27:41
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

