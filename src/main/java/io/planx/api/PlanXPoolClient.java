package io.planx.api;

import io.planx.api.model.response.ResponsePool;


import java.util.List;

public interface PlanXPoolClient {
    ResponsePool sendPoolInfoNew(String sourceSymbol, String targetSymbol, String sourceAmount, String targetAmount);

    List<ResponsePool> getPoolInfoList();

    ResponsePool getPoolInfoDetail(String poolId);

    ResponsePool sendPoolCapacityChange(String poolId, String sourceSymbol, String sourceAmount, String capacityAction);

    ResponsePool sendPoolFundDestroy(String poolId, String sourceSymbol, String targetSymbol);

    ResponsePool sendPoolStatusChange(String poolId, String sourceSymbol, String targetSymbol, String poolStatus);
}
