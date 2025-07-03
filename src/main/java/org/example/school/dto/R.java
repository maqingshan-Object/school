package org.example.school.dto;

import lombok.Data;

@Data
public class R {

    private String code;
    private String state;
    private Object data;

    public static R Success(){
        R r = new R();
        r.setCode("200");
        r.setState("success");
        return r;
    }

    public static R Success(Object data){
        R r = Success();
        r.setData(data);
        return r;
    }

}
