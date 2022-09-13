package com.example.accountbook.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Testdb {

    @TableId(type = IdType.AUTO)

    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Testdb() {
    }

    public Testdb(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Testdb{" +
                "test='" + test + '\'' +
                '}';
    }
}
