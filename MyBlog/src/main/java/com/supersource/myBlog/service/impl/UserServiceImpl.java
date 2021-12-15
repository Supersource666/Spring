package com.supersource.myBlog.service.impl;

import com.supersource.myBlog.entity.User;
import com.supersource.myBlog.mapper.UserMapper;
import com.supersource.myBlog.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author supersource
 * @since 2021-12-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
