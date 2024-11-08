package io.planx.api.common;

import io.planx.api.model.ApiPath;
import io.planx.api.model.request.*;
import io.planx.api.model.response.*;
import io.planx.api.core.common.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.List;

public interface PlanXApiService {

    @GET(ApiPath.ACCOUNT_BALANCES_BASE)
    Call<ResponseResult<List<ResponseBalancesBase>>> getAccountBalancesBase();

    @GET(ApiPath.ACCOUNT_BALANCES_POOL)
    Call<ResponseResult<List<ResponseBalancesPool>>> getAccountBalancesPool();

    @GET(ApiPath.ACCOUNT_BALANCES_MARKET)
    Call<ResponseResult<List<ResponseBalancesMarket>>> getAccountBalancesMarket();

    @POST(ApiPath.ACCOUNT_MARKET_INVEST)
    Call<ResponseResult<ResponseNewOrder>> sendAccountMarketInvest(@Body RequestNewInvestmentOrder investmentOrder);

    @POST(ApiPath.POOL_INFO_NEW)
    Call<ResponseResult<ResponsePool>> sendPoolInfoNew(@Body RequestNewSymbolTokenPool newPool);

    @GET(ApiPath.POOL_INFO_LIST)
    Call<ResponseResult<List<ResponsePool>>> getPoolInfoList();

    @POST(ApiPath.POOL_INFO_DETAIL)
    Call<ResponseResult<ResponsePool>> getPoolInfoDetail(@Body RequestPoolDetail detail);

    @POST(ApiPath.POOL_CAPACITY_CHANGE)
    Call<ResponseResult<ResponsePool>> sendPoolCapacityChange(@Body RequestChangeCapacityPool capacity);

    @POST(ApiPath.POOL_FUND_DESTROY)
    Call<ResponseResult<ResponsePool>> sendPoolFundDestroy(@Body RequestDestroyPool destroy);

    @POST(ApiPath.POOL_STATUS_CHANGE)
    Call<ResponseResult<ResponsePool>> sendPoolStatusChange(@Body RequestChangeStatusPool changeStatus);

    @POST(ApiPath.GIFT_INFO_NEW)
    Call<ResponseResult<ResponseGiftSourceInfo>> sendGiftSourceInfoNew(@Body RequestNewTokenGiftSource giftSource);

    @GET(ApiPath.GIFT_CLAIM_WAITING)
    Call<ResponseResult<List<ResponseGift>>> getGiftClaimWaiting();

    @POST(ApiPath.GIFT_INFO_DETAIL)
    Call<ResponseResult<ResponseGiftSourceDetail>> getGiftSourceInfoDetail(@Body RequestGiftSource source);

    @POST(ApiPath.GIFT_INFO_BATCH)
    Call<ResponseResult<List<ResponseGiftSourceDetail>>> getGiftSourceInfoBatch(@Body RequestGiftSourceBatch sourceBatch);

    @POST(ApiPath.GIFT_CLAIM_INFO_BATCH)
    Call<ResponseResult<List<ResponseGift>>> getGiftClaimInfoBatch(@Body RequestGiftBatch giftBatch);

    @POST(ApiPath.GIFT_CLAIM_ISSUED)
    Call<ResponseResult<ResponseIssuedGift>> sendGiftClaimIssued(@Body RequestGiftSource source);

    @POST(ApiPath.GIFT_INFO_FORCE_EXPIRE)
    Call<ResponseResult<ResponseGiftSourceExpire>> sendGiftInfoForceExpire(@Body RequestGiftSource source);

    @GET(ApiPath.TRADE_PENDING_LIST)
    Call<ResponseResult<List<ResponseTradeToken>>> getTradePendingList();

    @POST(ApiPath.TRADE_PENDING_DETAIL)
    Call<ResponseResult<List<ResponseTradeToken>>> getTradePendingDetail(@Body RequestTrade trade);

    @POST(ApiPath.TRADE_DEAL_BUY)
    Call<ResponseResult<ResponseTradeToken>> sendTradeDealBuy(@Body RequestTrade trade);
}
