package io.planx.api.model.request;

import io.planx.api.core.annotation.NotBlank;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class RequestDestroyPool {
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

    public RequestDestroyPool() {
    }

    public RequestDestroyPool(String poolId, String sourceSymbol, String targetSymbol) {
        this.poolId = poolId;
        this.sourceSymbol = sourceSymbol;
        this.targetSymbol = targetSymbol;
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
}
