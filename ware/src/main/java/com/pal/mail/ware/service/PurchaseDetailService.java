package com.pal.mail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pal.common.utils.PageUtils;
import com.pal.mail.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author pal
 * @email cnbupt@gmail.com
 * @date 2020-07-01 22:03:18
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

