package io.planx.api.common;

import io.planx.api.core.common.ApiConfiguration;
import io.planx.api.core.exception.PlanXException;
import io.planx.api.core.util.ErrorUtil;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class PlanXClientServiceFactory {

    private static final OkHttpClient sharedClient;
    private static final Converter.Factory converterFactory = JacksonConverterFactory.create();

    static {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequestsPerHost(500);
        dispatcher.setMaxRequests(500);
        sharedClient =
                new OkHttpClient.Builder()
                        .dispatcher(dispatcher)
                        .pingInterval(20, TimeUnit.SECONDS)
                        .build();
    }

    public static <V> V createService(Class<V> serviceClass, ApiConfiguration configuration) {
        return createService(
                serviceClass,
                configuration,
                new PlanXInterceptor(configuration));
    }

    public static <V> V createService(Class<V> serviceClass, ApiConfiguration configuration, Interceptor newInterceptor) {
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .baseUrl(configuration.getPath())
                .addConverterFactory(converterFactory);

        if (newInterceptor == null) {
            retrofitBuilder.client(sharedClient);
        } else {
            OkHttpClient adaptedClient = sharedClient.newBuilder()
                    .addInterceptor(newInterceptor)
                    .build();
            retrofitBuilder.client(adaptedClient);
        }

        Retrofit retrofit = retrofitBuilder.build();
        return retrofit.create(serviceClass);
    }

    /**
     * Execute a REST call and block until the response is received.
     */
    public static <V> V execute(Call<V> call) {
        try {
            Response<V> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                throw ErrorUtil.createHttpPlanxException(response.errorBody().toString());
            }
        } catch (IOException e) {
            throw new PlanXException(e);
        }
    }

    /**
     * Returns the shared OkHttpClient instance.
     */
    public static OkHttpClient getSharedClient() {
        return sharedClient;
    }
}
