package io.planx.api.core.common;

/**
 * @Author Todd
 * @Version 1.0
 **/
public enum PlanXEnumError {
    SUCCESS("200", "成功"),

    PARAM_ERROR("300", "Parameter error"),

    SERVER_SEND_HTTP_ERROR("501", "Send request exception"),
    ;
    private final String code;

    private final String msg;

    PlanXEnumError(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
