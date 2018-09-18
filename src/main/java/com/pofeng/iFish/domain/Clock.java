package com.pofeng.iFish.domain;

import java.util.Date;

public class Clock {
    private Integer id;

    private Integer uid;

    private Date lastting;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getLastting() {
        return lastting;
    }

    public void setLastting(Date lastting) {
        this.lastting = lastting;
    }
}