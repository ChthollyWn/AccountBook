package com.example.accountbook.controllers;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.accountbook.mapper.AccounttypeMapper;
import com.example.accountbook.model.Accounttype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/type")
public class AccounttypeController {
    @Autowired
    private AccounttypeMapper accounttypeMapper;

    @RequestMapping("/list")
    @ResponseBody
    public List<Accounttype> list(){
        List<Accounttype> list = accounttypeMapper.selectList(null);
        return list;
    }

    @RequestMapping("/add")
    @ResponseBody
    public int doAdd(String typename){
        QueryWrapper<Accounttype> wrapper = new QueryWrapper<>();
        wrapper.eq("typename",typename);
        Accounttype accounttype = accounttypeMapper.selectOne(wrapper);
        if(accounttype != null) return -1;
        Accounttype accounttypeNew = new Accounttype();
        accounttypeNew.setTypename(typename);
        int res = accounttypeMapper.insert(accounttypeNew);
        return res;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int doDelete(int id){
        int res = accounttypeMapper.deleteById(id);
        return res;
    }

    @RequestMapping("/update")
    @ResponseBody
    public int doUpdate(Accounttype accounttype){
        int res = accounttypeMapper.updateById(accounttype);
        return res;
    }

    @RequestMapping("/getone")
    @ResponseBody
    public Accounttype getOne(int id){
        Accounttype accounttype = accounttypeMapper.selectById(id);
        return accounttype;
    }

}
