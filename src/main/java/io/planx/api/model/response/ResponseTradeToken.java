package io.planx.api.model.response;



/**
 * @Author Todd
 * @Version 1.0
 **/
public class ResponseTradeToken {
    /**
     * Unique identifier of the trade
     */
    private String tradeId;
    /**
     * Token name on the left
     */
    private String sourceSymbol;
    /**
     * Token name on the right
     */
    private String targetSymbol;
    /**
     * User who owns the trade
     */
    private String userName;
    /**
     * Counterparty user of trade
     */
    private String counterPartyUserName;
    /**
     * Number of trading tokens
     */
    private String amount;
    /**
     * Trading token unit price
     */
    private String price;
    /**
     * Trade side,[ApiVars.TRADE_SIDE_BUY,ApiVars.TRADE_SIDE_SELL]
     */
    private String side;
    /**
     * Trade status,[ApiVars.TRADE_STATUS_DEAL,ApiVars.TRADE_STATUS_PENDING,ApiVars.TRADE_STATUS_CLOSED]
     */
    private String tradeStatus;
    private String voucherId;
    /**
     * The 10-digit second-level timestamp of this operation
     */
    private Long createTime;

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCounterPartyUserName() {
        return counterPartyUserName;
    }

    public void setCounterPartyUserName(String counterPartyUserName) {
        this.counterPartyUserName = counterPartyUserName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
