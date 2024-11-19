package io.planx.api;


import io.planx.api.common.PlanXApiService;
import io.planx.api.common.PlanXClientServiceFactory;
import io.planx.api.common.PlanXCommonClient;
import io.planx.api.model.request.*;
import io.planx.api.model.response.ResponsePool;
import io.planx.api.core.common.ApiConfiguration;
import io.planx.api.core.common.CheckParams;


import java.util.List;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class PlanXPoolClientImpl extends PlanXCommonClient implements PlanXPoolClient {

    private ApiConfiguration configuration;
    private PlanXApiService apiService;

    public PlanXPoolClientImpl(ApiConfiguration configuration) {
        this.configuration = configuration;
        apiService = PlanXClientServiceFactory.createService(PlanXApiService.class, this.configuration);
    }

    /**
     * Transfer an equal amount of tokens from the base account to create a new funding pool.
     * @param sourceSymbol Token name on the left
     * @param targetSymbol Token name on the right
     * @param sourceAmount The amount of tokens on the left
     * @param targetAmount The amount of tokens on the right
     */
    @Override
    public ResponsePool sendPoolInfoNew(String sourceSymbol, String targetSymbol,
                                        String sourceAmount, String targetAmount) {
        RequestNewSymbolTokenPool newPool=new RequestNewSymbolTokenPool(sourceSymbol,targetSymbol,sourceAmount,targetAmount);
        CheckParams.checkObjectNotNull(newPool);
        return super.send(apiService.sendPoolInfoNew(newPool));
    }

    /**
     * Get all capital pool objects.
     */
    @Override
    public List<ResponsePool> getPoolInfoList() {
        return super.send(apiService.getPoolInfoList());
    }

    /**
     * Get the details of a fund pool.
     * @param poolId The unique identifier of the capital pool
     */
    @Override
    public ResponsePool getPoolInfoDetail(String poolId) {
        RequestPoolDetail detail=new RequestPoolDetail(poolId);
        CheckParams.checkObjectNotNull(detail);
        return super.send(apiService.getPoolInfoDetail(detail));
    }

    /**
     * Increase or decrease the assets of the fund pool.
     * @param poolId The unique identifier of the capital pool
     * @param sourceSymbol Token name on the left
     * @param sourceAmount The amount of tokens on the left
     * @param capacityAction Capacity action [ApiVars.POOL_CAPACITY_ACTION_INCREASE,ApiVars.POOL_CAPACITY_ACTION_DECREASE]
     */
    @Override
    public ResponsePool sendPoolCapacityChange(String poolId, String sourceSymbol,
                                               String sourceAmount, String capacityAction) {
        RequestChangeCapacityPool capacity=new RequestChangeCapacityPool(poolId,sourceSymbol,sourceAmount,capacityAction);
        CheckParams.checkObjectNotNull(capacity);
        return super.send(apiService.sendPoolCapacityChange(capacity));
    }

    /**
     * Destroys the fund pool and returns the available amount to the base account.
     * @param poolId The unique identifier of the capital pool
     * @param sourceSymbol Token name on the left
     * @param targetSymbol Token name on the right
     */
    @Override
    public ResponsePool sendPoolFundDestroy(String poolId, String sourceSymbol, String targetSymbol) {
        RequestDestroyPool destroy=new RequestDestroyPool(poolId,sourceSymbol,targetSymbol);
        CheckParams.checkObjectNotNull(destroy);
        return super.send(apiService.sendPoolFundDestroy(destroy));
    }

    /**
     * Modify the active status of the capital pool.
     * @param poolId The unique identifier of the capital pool
     * @param sourceSymbol Token name on the left
     * @param targetSymbol Token name on the right
     * @param poolStatus Pool status [ApiVars.POOL_STATUS_ACTIVE,ApiVars.POOL_STATUS_INACTIVE]
     */
    @Override
    public ResponsePool sendPoolStatusChange(String poolId, String sourceSymbol, String targetSymbol, String poolStatus) {
        RequestChangeStatusPool changeStatus=new RequestChangeStatusPool(poolId,sourceSymbol,targetSymbol,poolStatus);
        CheckParams.checkObjectNotNull(changeStatus);
        return super.send(apiService.sendPoolStatusChange(changeStatus));
    }
}
