package io.planx.api.model.response;




/**
 * @Author Todd
 * @Version 1.0
 * Basic information about the order
 **/
public class ResponseNewOrder {
    /**
     * Account ID
     */
    private String userName;
    /**
     * Order ID
     */
    private String orderId;
    /**
     * The operation identifier passed in through parameters
     */
    private String externalOrderId;
    /**
     * Target Token Name
     */
    private String symbol;
    /**
     * Order type, only returns ApiVars.ORDER_TYPE_INVEST
     */
    private String orderType;
    /**
     * Order status, only returns ApiVars.ORDER_STATUS_SUCCESS
     */
    private String orderStatus;
    /**
     * Target token actual usage amount
     */
    private String originalAmount;
    /**
     * Target token usage amount
     */
    private String amount;
    /**
     * The 10-digit second-level timestamp of this operation
     */
    private Long timeCreated;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getExternalOrderId() {
        return externalOrderId;
    }

    public void setExternalOrderId(String externalOrderId) {
        this.externalOrderId = externalOrderId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(String originalAmount) {
        this.originalAmount = originalAmount;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Long getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Long timeCreated) {
        this.timeCreated = timeCreated;
    }
}
