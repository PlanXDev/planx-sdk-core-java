package io.planx.api.model.response;

import java.math.BigDecimal;

/**
 * @Author Todd
 * @Version 1.0
 * Balance information of the fund pool account
 **/
public class ResponseBalancesPool {
    /**
     * The unique identifier of the capital pool
     */
    private String poolId;
    /**
     * Token name on the left
     */
    private String sourceSymbol;
    /**
     * Token name on the right
     */
    private String targetSymbol;
    /**
     * The amount of tokens on the left
     */
    private BigDecimal sourceAmount;
    /**
     * The amount of tokens on the right
     */
    private BigDecimal targetAmount;

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
}
