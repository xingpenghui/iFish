package com.pofeng.iFish.common.util;

import com.pofeng.iFish.common.vo.ResVo;

public class ResUtil {
    public static ResVo createResult(int res){
        if(res>0){
            return ResVo.setOK();
        }else {
            return ResVo.setError();
        }
    }
}
