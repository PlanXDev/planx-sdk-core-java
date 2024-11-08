package io.planx.api.common;

import io.planx.api.model.ApiVars;
import io.planx.api.core.common.ApiConfiguration;
import io.planx.api.core.common.ParamsSign;
import io.planx.api.core.common.ParamsSortMap;
import io.planx.api.core.util.JsonUtil;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

import java.io.IOException;
import java.util.*;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class PlanXInterceptor implements Interceptor {

    private ApiConfiguration configuration;

    public PlanXInterceptor(ApiConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        Request.Builder newRequestBuilder = original.newBuilder();

        // add header last
        final String nonce = UUID.randomUUID().toString();

        Map parmMap = ParamsSortMap.getSortMap();
        parmMap.put(ApiVars.APP_ID, configuration.getAppId());
        parmMap.put(ApiVars.NONCE, nonce);

        String body2String = this.body2String(original.body());

        if (!body2String.equals("")) {
            Map<String, Object> _map = JsonUtil.jsonToMap(body2String);
            for (Object key : _map.keySet()) {
                parmMap.put(key, _map.get(key));
            }
        }
        final String sign = ParamsSign.sign(configuration.getSecretKey(), parmMap);

        newRequestBuilder
                .addHeader(ApiVars.APP_ID, configuration.getAppId())
                .addHeader(ApiVars.NONCE, nonce)
                .addHeader(ApiVars.SIGN, sign);

        // Build new request after adding the necessary authentication information
        Request newRequest = newRequestBuilder.build();
        return chain.proceed(newRequest);
    }

    /**
     * Extracts the request body into a String.
     *
     * @return request body as a string
     */
    private static String body2String(RequestBody request) {
        try (final Buffer buffer = new Buffer()) {
            final RequestBody copy = request;
            if (copy != null) {
                copy.writeTo(buffer);
            } else {
                return "";
            }
            return buffer.readUtf8();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        final PlanXInterceptor that = (PlanXInterceptor) o;
        return Objects.equals(configuration.getAppId(), that.configuration.getAppId()) &&
                Objects.equals(configuration.getSecretKey(), that.configuration.getSecretKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(configuration.getAppId(), configuration.getSecretKey());
    }
}
