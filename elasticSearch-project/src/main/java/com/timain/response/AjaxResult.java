package com.timain.response;

import lombok.Data;

@Data
public class AjaxResult {

    private Integer code;

    private Object data;

    private String msg;

    public AjaxResult(Integer code, Object o, String msg) {
        this.code = code;
        this.data = o;
        this.msg = msg;
    }

    public AjaxResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static AjaxResult success(Integer code, String msg) {
        return new AjaxResult(code, msg);
    }

    public static AjaxResult success(Integer code, Object data, String msg) {
        return new AjaxResult(code, data, msg);
    }
}
