package io.planx.api.model.response;

import java.math.BigDecimal;

/**
 * @Author Todd
 * @Version 1.0
 * Basic information on account balance
 **/
public class ResponseBalancesBase {
    /**
     * The token name of the account
     */
    private String symbol;
    /**
     * The available balance of the account
     */
    private BigDecimal available;
    /**
     * The frozen balance of the account
     */
    private BigDecimal frozen;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getAvailable() {
        return available;
    }

    public void setAvailable(BigDecimal available) {
        this.available = available;
    }

    public BigDecimal getFrozen() {
        return frozen;
    }

    public void setFrozen(BigDecimal frozen) {
        this.frozen = frozen;
    }
}
