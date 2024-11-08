package io.planx.api;

import io.planx.api.model.response.ResponseTradeToken;

import java.util.List;

public interface PlanXTradeClient {
    List<ResponseTradeToken> getTradePendingList();

    List<ResponseTradeToken> getTradePendingDetail(String tradeId);

    ResponseTradeToken sendTradeDealBuy(String tradeId);
}
