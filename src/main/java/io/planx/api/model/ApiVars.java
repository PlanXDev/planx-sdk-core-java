package io.planx.api.model;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class ApiVars {
    public static final String APP_ID = "appid";
    public static final String NONCE = "nonce";
    public static final String SIGN = "sign";

    public static final String ORDER_TYPE_INVEST = "invest";

    public static final String ORDER_STATUS_NEW = "new";
    public static final String ORDER_STATUS_SUCCESS = "success";
    public static final String ORDER_STATUS_FAIL = "fail";

    public static final String POOL_STATUS_ACTIVE = "active";
    public static final String POOL_STATUS_INACTIVE = "inactive";
    public static final String POOL_STATUS_DESTROY = "destroyed";

    public static final String POOL_CAPACITY_ACTION_INCREASE = "increase";
    public static final String POOL_CAPACITY_ACTION_DECREASE = "decrease";

    public static final String GIFT_TYPE_AIRDROP = "airdrop";
    public static final String GIFT_TYPE_REDEMPTION = "redemption";

    public static final String GIFT_STATUS_WAITING = "waiting";
    public static final String GIFT_STATUS_ISSUED = "issued";
    public static final String GIFT_STATUS_CLAIMED = "claimed";
    public static final String GIFT_STATUS_CANCEL = "cancel";
    public static final String GIFT_STATUS_EXPIRED = "expired";

    public static final String TRADE_SIDE_BUY = "buy";
    public static final String TRADE_SIDE_SELL = "sell";

    public static final String TRADE_STATUS_DEAL = "deal";
    public static final String TRADE_STATUS_PENDING = "pending";
    public static final String TRADE_STATUS_CLOSED = "closed";
}
