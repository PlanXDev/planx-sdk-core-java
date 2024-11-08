package io.planx.api;


import io.planx.api.common.PlanXApiService;
import io.planx.api.common.PlanXClientServiceFactory;
import io.planx.api.common.PlanXCommonClient;
import io.planx.api.model.request.RequestTrade;
import io.planx.api.model.response.ResponseTradeToken;
import io.planx.api.core.common.ApiConfiguration;
import io.planx.api.core.common.CheckParams;

import java.util.List;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class PlanXTradeClientImpl extends PlanXCommonClient implements PlanXTradeClient {

    private ApiConfiguration configuration;
    private PlanXApiService apiService;

    public PlanXTradeClientImpl(ApiConfiguration configuration) {
        this.configuration = configuration;
        apiService = PlanXClientServiceFactory.createService(PlanXApiService.class, this.configuration);
    }

    /**
     * Get all unfinished transactions.
     */
    @Override
    public List<ResponseTradeToken> getTradePendingList() {
        return super.send(apiService.getTradePendingList());
    }

    /**
     * Get details according to trade ID.
     * @param tradeId Unique identifier of the trade
     */
    @Override
    public List<ResponseTradeToken> getTradePendingDetail(String tradeId) {
        RequestTrade trade=new RequestTrade(tradeId);
        CheckParams.checkObjectNotNull(trade);
        return super.send(apiService.getTradePendingDetail(trade));
    }

    /**
     * The trade of purchasing the specified ID will deduct the corresponding funds from the market account.
     * Please confirm whether the funds are sufficient when calling.
     * @param tradeId Unique identifier of the trade
     */
    @Override
    public ResponseTradeToken sendTradeDealBuy(String tradeId) {
        RequestTrade trade=new RequestTrade(tradeId);
        CheckParams.checkObjectNotNull(trade);
        return super.send(apiService.sendTradeDealBuy(trade));
    }
}
