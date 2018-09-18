package com.pofeng.iFish.common.vo;

import java.io.Serializable;

public class ResVo implements Serializable {

    private int code;

    private String msg;

    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResVo(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResVo(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ResVo setOK(){
        return new ResVo(1,"OK");
    }

    public static ResVo setError(){
        return new ResVo(0,"Error");
    }

}
