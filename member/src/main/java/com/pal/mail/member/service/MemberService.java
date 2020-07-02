package com.pal.mail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pal.common.utils.PageUtils;
import com.pal.mail.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author pal
 * @email cnbupt@gmail.com
 * @date 2020-07-01 21:45:04
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

