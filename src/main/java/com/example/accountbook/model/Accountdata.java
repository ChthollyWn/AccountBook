package com.example.accountbook.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Accountdata {

    @TableId(type = IdType.AUTO)

    private int accountid;
    private int typeid;
    private int accounttype;
    private String accounttitle;
    private float accountmoney;
    private String marktext;
    private String accounttime;

    /*public Accountdata(int typeid, int accounttype, String accounttitle, float accountmoney, String marktext) {

    }*/

    public Accountdata(int typeid, int accounttype, String accounttitle, float accountmoney, String marktext) {
        this.typeid = typeid;
        this.accounttype = accounttype;
        this.accounttitle = accounttitle;
        this.accountmoney = accountmoney;
        this.marktext = marktext;
    }

    public Accountdata() {
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getAccounttitle() {
        return accounttitle;
    }

    public void setAccounttitle(String accounttitle) {
        this.accounttitle = accounttitle;
    }

    public float getAccountmoney() {
        return accountmoney;
    }

    public void setAccountmoney(float accountmoney) {
        this.accountmoney = accountmoney;
    }

    public String getMarktext() {
        return marktext;
    }

    public void setMarktext(String marktext) {
        this.marktext = marktext;
    }

    public String getAccounttime() {
        return accounttime;
    }

    public void setAccounttime(String accounttime) {
        this.accounttime = accounttime;
    }

    public int getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(int accounttype) {
        this.accounttype = accounttype;
    }

}
