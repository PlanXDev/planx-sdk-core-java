package io.planx.api.model.request;

import io.planx.api.core.annotation.NotBlank;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class RequestPoolDetail {
    /**
     * The unique identifier of the capital pool
     */
    @NotBlank
    private String poolId;

    public RequestPoolDetail() {
    }

    public RequestPoolDetail(String poolId) {
        this.poolId = poolId;
    }

    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }
}
