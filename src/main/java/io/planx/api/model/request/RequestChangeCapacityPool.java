package io.planx.api.model.request;

import io.planx.api.model.ApiVars;
import io.planx.api.core.annotation.Min;
import io.planx.api.core.annotation.NotBlank;
import io.planx.api.core.annotation.NotNull;



/**
 * @Author Todd
 * @Version 1.0
 **/
public class RequestChangeCapacityPool {
    /**
     * The unique identifier of the capital pool
     */
    @NotBlank
    private String poolId;
    /**
     * Token name on the left
     */
    @NotBlank
    private String sourceSymbol;
    /**
     * The amount of tokens on the left
     */
    @NotNull
    @Min(eq = false)
    private String sourceAmount;
    /**
     * Capacity action [ApiVars.POOL_CAPACITY_ACTION_INCREASE,ApiVars.POOL_CAPACITY_ACTION_DECREASE]
     */
    @NotBlank(eqs = {ApiVars.POOL_CAPACITY_ACTION_INCREASE,ApiVars.POOL_CAPACITY_ACTION_DECREASE})
    private String capacityAction;

    public RequestChangeCapacityPool() {
    }

    public RequestChangeCapacityPool(String poolId, String sourceSymbol, String sourceAmount, String capacityAction) {
        this.poolId = poolId;
        this.sourceSymbol = sourceSymbol;
        this.sourceAmount = sourceAmount;
        this.capacityAction = capacityAction;
    }

    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public String getSourceSymbol() {
        return sourceSymbol;
    }

    public void setSourceSymbol(String sourceSymbol) {
        this.sourceSymbol = sourceSymbol;
    }

    public String getSourceAmount() {
        return sourceAmount;
    }

    public void setSourceAmount(String sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    public String getCapacityAction() {
        return capacityAction;
    }

    public void setCapacityAction(String capacityAction) {
        this.capacityAction = capacityAction;
    }
}
