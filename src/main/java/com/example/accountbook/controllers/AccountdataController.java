package com.example.accountbook.controllers;

import com.example.accountbook.mapper.AccountdataMapper;
import com.example.accountbook.model.Accountdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/data")
public class AccountdataController {

    @Autowired
    private AccountdataMapper accountdataMapper;

    @RequestMapping("/list")
    @ResponseBody
    public List<Accountdata> list(){
        List<Accountdata> list = accountdataMapper.selectList(null);
        return list;
    }

}
