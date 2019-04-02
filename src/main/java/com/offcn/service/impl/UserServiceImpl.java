package com.offcn.service.impl;

import com.offcn.po.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Sunny
 * @Description:Ujiuye
 * @Date:Create：in 2019/3/22 0022 下午 4:38
 * @Modified By：
 */
//ctrl+o 重写接口继承父类的方法
    @Service
public class UserServiceImpl implements UserService {
    //注入spring和jdbc封装对象 jdbcTemplate
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getall() {
        return jdbcTemplate.query("select * from user",new BeanPropertyRowMapper<>(User.class));
    }
}
