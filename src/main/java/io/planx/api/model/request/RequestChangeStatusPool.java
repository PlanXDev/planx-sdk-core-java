package io.planx.api.model.request;


import io.planx.api.model.ApiVars;
import io.planx.api.core.annotation.NotBlank;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class RequestChangeStatusPool {
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
     * Token name on the right
     */
    @NotBlank
    private String targetSymbol;
    /**
     * Pool status [ApiVars.POOL_STATUS_ACTIVE,ApiVars.POOL_STATUS_INACTIVE]
     */
    @NotBlank(eqs = {ApiVars.POOL_STATUS_ACTIVE,ApiVars.POOL_STATUS_INACTIVE})
    private String poolStatus;

    public RequestChangeStatusPool() {
    }

    public RequestChangeStatusPool(String poolId, String sourceSymbol, String targetSymbol, String poolStatus) {
        this.poolId = poolId;
        this.sourceSymbol = sourceSymbol;
        this.targetSymbol = targetSymbol;
        this.poolStatus = poolStatus;
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

    public String getTargetSymbol() {
        return targetSymbol;
    }

    public void setTargetSymbol(String targetSymbol) {
        this.targetSymbol = targetSymbol;
    }

    public String getPoolStatus() {
        return poolStatus;
    }

    public void setPoolStatus(String poolStatus) {
        this.poolStatus = poolStatus;
    }
}
