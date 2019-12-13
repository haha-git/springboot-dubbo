package com.sy.mapper;

import com.sy.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 7z
 * @since 2019-12-13
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    List<UserInfo> list();
}
