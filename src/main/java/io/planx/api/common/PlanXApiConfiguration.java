package io.planx.api.common;

import io.planx.api.core.common.ApiConfiguration;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class PlanXApiConfiguration implements ApiConfiguration {
    private static final String DEFAULT_PATH = "http://localhost:8080";
    private static final String DEFAULT_APP_ID = "APP_ID";
    private static final String DEFAULT_SECRET_KEY = "SECRET_KEY";
    private String path;
    private String appId;
    private String secretKey;

    public PlanXApiConfiguration() {
        this.path = DEFAULT_PATH;
        this.appId = DEFAULT_APP_ID;
        this.secretKey = DEFAULT_SECRET_KEY;
    }

    public PlanXApiConfiguration(String path, String appId, String secretKey) {
        this.path = path;
        this.appId = appId;
        this.secretKey = secretKey;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public String getAppId() {
        return appId;
    }

    @Override
    public String getSecretKey() {
        return secretKey;
    }

}
