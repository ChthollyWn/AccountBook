package com.example.accountbook.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Accounttype {

    @TableId(type = IdType.AUTO)

    private int typeid;
    private String typename;

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Accounttype() {
    }

    public Accounttype(int typeid, String typename) {
        this.typeid = typeid;
        this.typename = typename;
    }
}
