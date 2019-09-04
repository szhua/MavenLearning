package com.szhua.api.service.impl;

import com.szhua.api.entity.Users;
import com.szhua.api.mapper.UsersMapper;
import com.szhua.api.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author runer
 * @since 2019-09-03
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
