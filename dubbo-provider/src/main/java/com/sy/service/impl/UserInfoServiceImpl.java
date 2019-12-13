package com.sy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sy.entity.UserInfo;
import com.sy.service.UserInfoService;
import com.sy.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 7z
 * @since 2019-12-13
 */
@Service(version = "${test.service.version}")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> list() {
        return userInfoMapper.list();
    }
}
