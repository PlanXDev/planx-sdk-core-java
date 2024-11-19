package io.planx.api.model.response;



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
    private String available;
    /**
     * The frozen balance of the account
     */
    private String frozen;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getFrozen() {
        return frozen;
    }

    public void setFrozen(String frozen) {
        this.frozen = frozen;
    }
}
