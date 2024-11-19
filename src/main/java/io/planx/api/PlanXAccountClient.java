package io.planx.api;

import io.planx.api.model.response.ResponseBalancesBase;
import io.planx.api.model.response.ResponseBalancesMarket;
import io.planx.api.model.response.ResponseBalancesPool;
import io.planx.api.model.response.ResponseNewOrder;


import java.util.List;

public interface PlanXAccountClient {
    List<ResponseBalancesBase> getAccountBalancesBase();
    List<ResponseBalancesPool> getAccountBalancesPool();
    List<ResponseBalancesMarket> getAccountBalancesMarket();
    ResponseNewOrder sendAccountMarketInvest(String externalOrderId, String sourceSymbol, String targetSymbol, String targetAmount);
}
