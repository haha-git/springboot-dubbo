package com.sy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sy.entity.UserInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 7z
 * @since 2019-12-13
 */
public interface UserInfoService{
    List<UserInfo> list();
}
