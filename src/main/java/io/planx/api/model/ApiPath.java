package io.planx.api.model;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class ApiPath {
    public static final String ACCOUNT_BALANCES_BASE="/v1/api/account/balances/base";
    public static final String ACCOUNT_BALANCES_POOL="/v1/api/account/balances/pool";
    public static final String ACCOUNT_BALANCES_MARKET="/v1/api/account/balances/market";
    public static final String ACCOUNT_MARKET_INVEST="/v1/api/account/market/invest";

    public static final String POOL_INFO_NEW="/v1/api/pool/info/new";
    public static final String POOL_INFO_LIST="/v1/api/pool/info/list";
    public static final String POOL_INFO_DETAIL="/v1/api/pool/info/detail";
    public static final String POOL_CAPACITY_CHANGE="/v1/api/pool/capacity/change";
    public static final String POOL_FUND_DESTROY="/v1/api/pool/fund/destroy";
    public static final String POOL_STATUS_CHANGE="/v1/api/pool/status/change";

    public static final String GIFT_INFO_NEW="/v1/api/gift/info/new";
    public static final String GIFT_CLAIM_WAITING="/v1/api/gift/claim/waiting";
    public static final String GIFT_INFO_DETAIL="/v1/api/gift/info/detail";
    public static final String GIFT_INFO_BATCH="/v1/api/gift/info/batch";
    public static final String GIFT_CLAIM_INFO_BATCH="/v1/api/gift/claim/info/batch";
    public static final String GIFT_CLAIM_ISSUED="/v1/api/gift/claim/issued";
    public static final String GIFT_INFO_FORCE_EXPIRE="/v1/api/gift/info/forceExpire";


    public static final String TRADE_PENDING_LIST="/v1/api/trade/pending/list";
    public static final String TRADE_PENDING_DETAIL="/v1/api/trade/pending/detail";
    public static final String TRADE_DEAL_BUY="/v1/api/trade/deal/buy";
}
