package io.planx.api.model.request;


import io.planx.api.core.annotation.Min;
import io.planx.api.core.annotation.NotBlank;
import io.planx.api.core.annotation.NotNull;

import java.math.BigDecimal;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class RequestNewSymbolTokenPool {
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
     * The amount of tokens on the left
     */
    @NotNull
    @Min
    private BigDecimal sourceAmount;
    /**
     * The amount of tokens on the right
     */
    @NotNull
    @Min
    private BigDecimal targetAmount;

    public RequestNewSymbolTokenPool() {
    }

    public RequestNewSymbolTokenPool(String sourceSymbol, String targetSymbol, BigDecimal sourceAmount, BigDecimal targetAmount) {
        this.sourceSymbol = sourceSymbol;
        this.targetSymbol = targetSymbol;
        this.sourceAmount = sourceAmount;
        this.targetAmount = targetAmount;
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
