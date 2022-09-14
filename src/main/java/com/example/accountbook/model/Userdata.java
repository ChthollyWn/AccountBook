package com.example.accountbook.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Userdata {

    @TableId(type = IdType.AUTO)

    private int userid;
    private String username;
    private String userpwd;

    public Userdata() {
    }

    public Userdata(String username, String userpwd) {
        this.username = username;
        this.userpwd = userpwd;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }
}
