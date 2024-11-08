package io.planx.api.common;

import io.planx.api.core.common.ResponseResult;
import io.planx.api.core.exception.PlanXException;
import io.planx.api.core.util.ErrorUtil;
import retrofit2.Call;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class PlanXCommonClient {
    protected <T> T send(Call<ResponseResult<T>> call) throws PlanXException {
        ResponseResult<T> result = PlanXClientServiceFactory.execute(call);
        if (result.getSuccess())
            return result.getData();
        throw ErrorUtil.createHttpPlanxException(result.getDesc()!=null?result.getDesc():result.getMsg());
    }
}
