package io.planx.api.core.exception;

import io.planx.api.core.common.PlanXEnumError;

import java.io.Serializable;

/**
 * @Author Todd
 * @Date 2024/10/30 3:08
 * @Version 1.0
 **/
public class PlanXException  extends RuntimeException implements Serializable {
    private String message;
    private String code;

    public PlanXException(Throwable cause) {
        super(cause);
    }

    public PlanXException(String code,String message) {
        super(String.format(" %s %s", code, message));
        this.message = message;
        this.code = code;
    }

    public PlanXException(PlanXEnumError error) {
        super(String.format(" %s %s", error.getCode(), error.getMsg()));
        this.message = error.getMsg();
        this.code = error.getCode();
    }

    public String getCode() {
        return code;
    }
}
