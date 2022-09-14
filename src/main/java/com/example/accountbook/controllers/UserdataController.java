package com.example.accountbook.controllers;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.accountbook.mapper.UserdataMapper;
import com.example.accountbook.model.Userdata;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/userdata")
public class UserdataController {

    @Autowired
    private UserdataMapper userdataMapper;

    @RequestMapping("/login")
    @ResponseBody
    public int login(String username, String password){
        QueryWrapper<Userdata> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username);
        Userdata user = userdataMapper.selectOne(wrapper);
        if(user != null && user.getUserpwd().equals(password)) return 1;
        return -1;
    }

    @RequestMapping("register")
    @ResponseBody
    public int register(String username,String password){
        QueryWrapper<Userdata> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username);
        Userdata user = userdataMapper.selectOne(wrapper);
        if(user != null) return -1;
        Userdata userNew = new Userdata(username,password);
        int res = userdataMapper.insert(userNew);
        return res;
    }

}
