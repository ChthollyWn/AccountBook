package com.example.accountbook.controllers;

import com.example.accountbook.mapper.AccountdataMapper;
import com.example.accountbook.model.Accountdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
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

    @RequestMapping("/add")
    @ResponseBody
    public int doAdd(int typeid,int accounttype,String accounttitle,float accountmoney,String marktext){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String strDate = sdf.format( new Date() );

        Accountdata accountdata = new Accountdata(typeid,accounttype,accounttitle,accountmoney,marktext);

        accountdata.setAccounttime(strDate);

        int res = accountdataMapper.insert(accountdata);
        return res;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int doDelete(int id){
        int res = accountdataMapper.deleteById(id);
        return res;
    }

    @RequestMapping("/update")
    @ResponseBody
    public int doUpdate(Accountdata accountdata){
        int res = accountdataMapper.updateById(accountdata);
        return res;
    }

    @RequestMapping("/getone")
    @ResponseBody
    public Accountdata getOne(int id){
        Accountdata accountdata = accountdataMapper.selectById(id);
        return accountdata;
    }

}
