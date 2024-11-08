package io.planx.api;

import io.planx.api.common.PlanXClientFactory;
import io.planx.api.model.response.ResponseBalancesBase;
import io.planx.api.model.response.ResponseGiftSourceDetail;

import java.util.List;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args){
        String baseUrl = "http://cp-api.planx.io";
        String appId = "Go to the PlanX CP website to get";
        String secretKey = "Go to the PlanX CP website to get";
        PlanXClientFactory planXClientFactory = PlanXClientFactory.newInstance(baseUrl,appId, secretKey);
        List<ResponseBalancesBase> balancesBase = planXClientFactory.newAccountClient().getAccountBalancesBase();

        // Process your bussiness ...`.`
    }
}
