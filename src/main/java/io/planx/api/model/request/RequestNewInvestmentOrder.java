package io.planx.api.model.request;

import io.planx.api.core.annotation.Min;
import io.planx.api.core.annotation.NotBlank;
import io.planx.api.core.annotation.NotNull;

import java.math.BigDecimal;

/**
 * @Author Todd
 * @Version 1.0
 *
 **/
public class RequestNewInvestmentOrder {
    /**
     * External order ID,This parameter is used to mark this operation
     */
    @NotBlank
    private String externalOrderId;
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
     * The amount of tokens on the right
     */
    @NotNull
    @Min(eq = false)
    private BigDecimal targetAmount;

    public RequestNewInvestmentOrder() {
    }

    public RequestNewInvestmentOrder(String externalOrderId, String sourceSymbol, String targetSymbol, BigDecimal targetAmount) {
        this.externalOrderId = externalOrderId;
        this.sourceSymbol = sourceSymbol;
        this.targetSymbol = targetSymbol;
        this.targetAmount = targetAmount;
    }

    public String getExternalOrderId() {
        return externalOrderId;
    }

    public void setExternalOrderId(String externalOrderId) {
        this.externalOrderId = externalOrderId;
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

    public BigDecimal getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(BigDecimal targetAmount) {
        this.targetAmount = targetAmount;
    }
}
