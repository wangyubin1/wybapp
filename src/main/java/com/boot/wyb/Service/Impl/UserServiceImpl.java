package com.boot.wyb.Service.Impl;

import com.boot.wyb.Dao.UserMapper;
import com.boot.wyb.Service.UserService;
import com.boot.wyb.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> hello()throws Exception {
        return userMapper.hello();
    }
}