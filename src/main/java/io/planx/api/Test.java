package io.planx.api;

import io.planx.api.common.PlanXClientFactory;
import io.planx.api.model.response.ResponseGiftSourceDetail;

import java.util.List;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args){
        PlanXClientFactory planXClientFactory = PlanXClientFactory.newInstance("http://192.168.1.200:8886",
                "cg7Zqpb4", "842c2d804f5b5e9bba7a35436d9585b26bca4c69");
        List<ResponseGiftSourceDetail> sourceInfoBatch = planXClientFactory.newGiftClient().
                getGiftSourceInfoBatch(new String[]{"1E44BA0A-6D95-450B-9D0D-9F934FC5EFCA",
                        "215FF713-D8C5-44DD-9597-9CCD722BE39E","498DDBA1-E4AD-45CD-A9A1-27A11DDC201B"});
        System.out.println(sourceInfoBatch.toString());
    }
}
