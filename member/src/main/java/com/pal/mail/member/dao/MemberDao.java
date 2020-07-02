package com.pal.mail.member.dao;

import com.pal.mail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author pal
 * @email cnbupt@gmail.com
 * @date 2020-07-01 21:45:04
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
