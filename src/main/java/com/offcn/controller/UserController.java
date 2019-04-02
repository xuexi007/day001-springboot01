package com.offcn.controller;

import com.offcn.po.Pie;
import com.offcn.po.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Sunny
 * @Description:Ujiuye
 * @Date:Create：in 2019/3/22 0022 下午 4:43
 * @Modified By：
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getall")
    public List<User> getall(){
        return userService.getall();
    }

    @RequestMapping("/getallpie")
    public List<Pie> getallPie(){
        ArrayList<Pie> list1 = new ArrayList<>();
        List<User> list = userService.getall();
        for (User u:list){
            Pie pie = new Pie();

            pie.setName(u.getName());
            pie.setValue(u.getScore());
            list1.add(pie);
        }
        return list1;
    }
}
