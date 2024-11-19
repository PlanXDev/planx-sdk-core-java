package io.planx.api.model.request;


import io.planx.api.core.annotation.Min;
import io.planx.api.core.annotation.NotBlank;
import io.planx.api.core.annotation.NotNull;



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
    private String sourceAmount;
    /**
     * The amount of tokens on the right
     */
    @NotNull
    @Min
    private String targetAmount;

    public RequestNewSymbolTokenPool() {
    }

    public RequestNewSymbolTokenPool(String sourceSymbol, String targetSymbol, String sourceAmount, String targetAmount) {
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

    public String getSourceAmount() {
        return sourceAmount;
    }

    public void setSourceAmount(String sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    public String getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(String targetAmount) {
        this.targetAmount = targetAmount;
    }
}
