package io.planx.api.core.common;

import java.io.Serializable;
/**
 * @Author Todd
 * @Version 1.0
 **/
public class ResponseResult<T> implements Serializable {
    private String code;
    private Boolean success;
    private String msg;
    private String desc;

    private T data;

    public ResponseResult() {
    }

    public ResponseResult(String code, Boolean success, String msg, String desc, T data) {
        this.code = code;
        this.success = success;
        this.msg = msg;
        this.desc = desc;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}