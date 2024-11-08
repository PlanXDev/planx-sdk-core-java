package io.planx.api.model.request;

import io.planx.api.core.annotation.NotBlank;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class RequestTrade {
    /**
     * Unique identifier of the trade
     */
    @NotBlank
    private String tradeId;

    public RequestTrade() {
    }

    public RequestTrade(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }
}
