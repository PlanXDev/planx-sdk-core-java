package io.planx.api;

import io.planx.api.model.response.ResponsePool;

import java.math.BigDecimal;
import java.util.List;

public interface PlanXPoolClient {
    ResponsePool sendPoolInfoNew(String sourceSymbol, String targetSymbol, BigDecimal sourceAmount, BigDecimal targetAmount);

    List<ResponsePool> getPoolInfoList();

    ResponsePool getPoolInfoDetail(String poolId);

    ResponsePool sendPoolCapacityChange(String poolId, String sourceSymbol, BigDecimal sourceAmount, String capacityAction);

    ResponsePool sendPoolFundDestroy(String poolId, String sourceSymbol, String targetSymbol);

    ResponsePool sendPoolStatusChange(String poolId, String sourceSymbol, String targetSymbol, String poolStatus);
}
