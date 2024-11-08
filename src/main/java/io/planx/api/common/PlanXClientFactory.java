package io.planx.api.common;

import io.planx.api.*;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class PlanXClientFactory {
    private PlanXApiConfiguration configuration;

    private PlanXClientFactory(PlanXApiConfiguration configuration) {
        this.configuration = configuration;
    }

    public static PlanXClientFactory newInstance(PlanXApiConfiguration configuration) {
        return new PlanXClientFactory(configuration);
    }

    public static PlanXClientFactory newInstance(String restHost,String appId, String secretKey) {
        final PlanXApiConfiguration configuration =
                new PlanXApiConfiguration(restHost,appId, secretKey);
        return new PlanXClientFactory(configuration);
    }

    public PlanXAccountClient newAccountClient() {
        return new PlanXAccountClientImpl(configuration);
    }

    public PlanXGiftClient newGiftClient() {
        return new PlanXGiftClientImpl(configuration);
    }

    public PlanXPoolClient newPoolClient() {
        return new PlanXPoolClientImpl(configuration);
    }

    public PlanXTradeClient newTradeClient() {
        return new PlanXTradeClientImpl(configuration);
    }

}
