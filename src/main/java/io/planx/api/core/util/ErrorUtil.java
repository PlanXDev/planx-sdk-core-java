package io.planx.api.core.util;

import io.planx.api.core.common.PlanXEnumError;
import io.planx.api.core.exception.PlanXException;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class ErrorUtil {
    public static PlanXException createPlanxException(PlanXEnumError errorEnum) {
        return new PlanXException(errorEnum.getCode(),errorEnum.getMsg());
    }

    public static PlanXException createHttpPlanxException(String msg) {
        return new PlanXException(PlanXEnumError.SERVER_SEND_HTTP_ERROR.getCode(),msg);
    }

    public static PlanXException createParamsPlanxException(String msg) {
        return new PlanXException(PlanXEnumError.PARAM_ERROR.getCode(),msg);
    }
}
