package com.timain.service.impl;

import com.timain.domain.User;
import com.timain.mapper.UserMapper;
import com.timain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addData(User user) {
        userMapper.save(user);
    }

    @Override
    public void updateData(User user) {
        userMapper.save(user);
    }

    @Override
    public void deleteData(User user) {
        userMapper.delete(user);
    }
}
