package com.yibo.service;

import com.yibo.center.domain.entity.User;
import com.yibo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: huangyibo
 * @Date: 2020/6/10 23:46
 * @Description:
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll(){
        return userMapper.selectAll();
    }

    public User findById(Integer id){
        User user = new User();
        user.setId(id);
        return userMapper.selectOne(user);
    }
}
