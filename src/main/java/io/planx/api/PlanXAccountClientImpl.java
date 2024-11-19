package io.planx.api;

import io.planx.api.common.PlanXApiService;
import io.planx.api.common.PlanXClientServiceFactory;
import io.planx.api.common.PlanXCommonClient;
import io.planx.api.model.request.RequestNewInvestmentOrder;
import io.planx.api.model.response.ResponseBalancesBase;
import io.planx.api.model.response.ResponseBalancesMarket;
import io.planx.api.model.response.ResponseBalancesPool;
import io.planx.api.model.response.ResponseNewOrder;
import io.planx.api.core.common.ApiConfiguration;
import io.planx.api.core.common.CheckParams;


import java.util.List;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class PlanXAccountClientImpl extends PlanXCommonClient implements PlanXAccountClient {

    private ApiConfiguration configuration;
    private PlanXApiService apiService;

    public PlanXAccountClientImpl(ApiConfiguration configuration) {
        this.configuration = configuration;
        apiService = PlanXClientServiceFactory.createService(PlanXApiService.class, this.configuration);
    }

    /**
     * Get balance information for all token accounts
     */
    @Override
    public List<ResponseBalancesBase> getAccountBalancesBase() {
        return super.send(apiService.getAccountBalancesBase());
    }

    /**
     * Obtain the balance information of all fund pool accounts
     */
    @Override
    public List<ResponseBalancesPool> getAccountBalancesPool() {
        return super.send(apiService.getAccountBalancesPool());
    }

    /**
     * Get balance information for all market accounts
     */
    @Override
    public List<ResponseBalancesMarket> getAccountBalancesMarket() {
        return super.send(apiService.getAccountBalancesMarket());
    }

    /**
     * Add funds to a designated token market account
     * @param externalOrderId External order ID,This parameter is used to mark this operation
     * @param sourceSymbol Token name on the left
     * @param targetSymbol Token name on the right
     * @param targetAmount The amount of tokens on the right
     */
    @Override
    public ResponseNewOrder sendAccountMarketInvest(String externalOrderId, String sourceSymbol, String targetSymbol,
                                                    String targetAmount) {
        RequestNewInvestmentOrder investmentOrder = new RequestNewInvestmentOrder(externalOrderId, sourceSymbol, targetSymbol, targetAmount);
        CheckParams.checkObjectNotNull(investmentOrder);
        return super.send(apiService.sendAccountMarketInvest(investmentOrder));
    }
}
