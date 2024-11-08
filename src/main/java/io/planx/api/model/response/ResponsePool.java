package io.planx.api.model.response;

import java.math.BigDecimal;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class ResponsePool {
    /**
     * The unique identifier of the capital pool
     */
    private String poolId;
    /**
     * Account ID
     */
    private String userName;
    /**
     * Token name on the left
     */
    private String sourceSymbol;
    /**
     * Token name on the right
     */
    private String targetSymbol;
    /**
     * The original amount of tokens on the left
     */
    private BigDecimal sourceOriginalAmount;
    /**
     * The original amount of tokens on the right
     */
    private BigDecimal targetOriginalAmount;
    /**
     * The amount of tokens on the left
     */
    private BigDecimal sourceAmount;
    /**
     * The amount of tokens on the right
     */
    private BigDecimal targetAmount;
    /**
     * The amount of tokens used on the left
     */
    private BigDecimal sourceDealAmount;
    /**
     * The amount of tokens used on the right
     */
    private BigDecimal targetDealAmount;
    /**
     * Pool status [ApiVars.POOL_STATUS_ACTIVE,ApiVars.POOL_STATUS_INACTIVE,ApiVars.POOL_STATUS_DESTROY]
     */
    private BigDecimal poolStatus;

    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public BigDecimal getSourceOriginalAmount() {
        return sourceOriginalAmount;
    }

    public void setSourceOriginalAmount(BigDecimal sourceOriginalAmount) {
        this.sourceOriginalAmount = sourceOriginalAmount;
    }

    public BigDecimal getTargetOriginalAmount() {
        return targetOriginalAmount;
    }

    public void setTargetOriginalAmount(BigDecimal targetOriginalAmount) {
        this.targetOriginalAmount = targetOriginalAmount;
    }

    public BigDecimal getSourceAmount() {
        return sourceAmount;
    }

    public void setSourceAmount(BigDecimal sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    public BigDecimal getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(BigDecimal targetAmount) {
        this.targetAmount = targetAmount;
    }

    public BigDecimal getSourceDealAmount() {
        return sourceDealAmount;
    }

    public void setSourceDealAmount(BigDecimal sourceDealAmount) {
        this.sourceDealAmount = sourceDealAmount;
    }

    public BigDecimal getTargetDealAmount() {
        return targetDealAmount;
    }

    public void setTargetDealAmount(BigDecimal targetDealAmount) {
        this.targetDealAmount = targetDealAmount;
    }

    public BigDecimal getPoolStatus() {
        return poolStatus;
    }

    public void setPoolStatus(BigDecimal poolStatus) {
        this.poolStatus = poolStatus;
    }
}
