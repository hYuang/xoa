package com.xoa.model.response;

import com.xoa.constant.CommonConstant;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
public class Response<T> extends  BaseResponse {

    private T t ;

    private String status;

    private String code;

    public Map<String,Object> toData(){
        Map<String,Object> data = new HashMap<>();
        data.put(CommonConstant.STATUS,this.getStatus());
        data.put(CommonConstant.CODE,this.getCode());
        data.put(CommonConstant.DATA,this.getT());
        data.put(CommonConstant.PAGE,this.getPage());
        return data;
    };


}
