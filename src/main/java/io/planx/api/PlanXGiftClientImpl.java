package io.planx.api;


import io.planx.api.common.PlanXApiService;
import io.planx.api.common.PlanXClientServiceFactory;
import io.planx.api.common.PlanXCommonClient;
import io.planx.api.model.request.RequestGiftBatch;
import io.planx.api.model.request.RequestGiftSource;
import io.planx.api.model.request.RequestGiftSourceBatch;
import io.planx.api.model.request.RequestNewTokenGiftSource;
import io.planx.api.model.response.*;
import io.planx.api.core.common.ApiConfiguration;
import io.planx.api.core.common.CheckParams;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class PlanXGiftClientImpl extends PlanXCommonClient implements PlanXGiftClient {

    private ApiConfiguration configuration;
    private PlanXApiService apiService;

    public PlanXGiftClientImpl(ApiConfiguration configuration) {
        this.configuration = configuration;
        apiService = PlanXClientServiceFactory.createService(PlanXApiService.class, this.configuration);
    }

    /**
     * Create a new superior gift pack.
     * @param poolId The unique identifier of the capital pool
     * @param giftName Gift name
     * @param giftType Gift type [ApiVars.GIFT_TYPE_AIRDROP,ApiVars.GIFT_TYPE_REDEMPTION]
     * @param quantity Generate quantity,1<=quantity<=2000
     * @param priceAmount Number of tokens for a single Gift
     * @param expiresSeconds Expiration time.Expires after specified number of seconds
     */
    @Override
    public ResponseGiftSourceInfo sendGiftSourceInfoNew(String poolId, String giftName, String giftType, Integer quantity,
                                                        BigDecimal priceAmount, Long expiresSeconds) {
        RequestNewTokenGiftSource giftSource=new RequestNewTokenGiftSource(poolId,giftName,giftType,
                quantity,priceAmount,expiresSeconds);
        CheckParams.checkObjectNotNull(giftSource);
        return super.send(apiService.sendGiftSourceInfoNew(giftSource));
    }

    /**
     * Get all available sub-gift packs.
     */
    @Override
    public List<ResponseGift> getGiftClaimWaiting() {
        return super.send(apiService.getGiftClaimWaiting());
    }

    /**
     * Check the details of the superior gift pack corresponding to the Code.
     * @param giftSourceQrCode The unique CODE of the gift source
     */
    @Override
    public ResponseGiftSourceDetail getGiftSourceInfoDetail(String giftSourceQrCode) {
        RequestGiftSource source=new RequestGiftSource(giftSourceQrCode);
        CheckParams.checkObjectNotNull(source);
        return super.send(apiService.getGiftSourceInfoDetail(source));
    }

    /**
     * Batch query the superior gift packs details corresponding to the code.
     * @param giftSourceQrCodes The unique CODE of the gift source
     */
    @Override
    public List<ResponseGiftSourceDetail> getGiftSourceInfoBatch(String[] giftSourceQrCodes) {
        RequestGiftSourceBatch sourceBatch=new RequestGiftSourceBatch(giftSourceQrCodes);
        CheckParams.checkObjectNotNull(sourceBatch);
        return super.send(apiService.getGiftSourceInfoBatch(sourceBatch));
    }

    /**
     * Batch query the sub-gift packs details corresponding to the superior gift pack code.
     * @param giftSourceQrCode The unique CODE of the gift source
     * @param giftQrCode The unique CODE of the gift
     */
    @Override
    public List<ResponseGift> getGiftClaimInfoBatch(String giftSourceQrCode,String[] giftQrCode) {
        RequestGiftBatch giftBatch=new RequestGiftBatch(giftSourceQrCode,giftQrCode);
        CheckParams.checkObjectNotNull(giftBatch);
        return super.send(apiService.getGiftClaimInfoBatch(giftBatch));
    }

    /**
     * Send a sub-gift pack through the superior gift pack code.
     * @param giftSourceQrCode The unique CODE of the gift source
     */
    @Override
    public ResponseIssuedGift sendGiftClaimIssued(String giftSourceQrCode) {
        RequestGiftSource source=new RequestGiftSource(giftSourceQrCode);
        CheckParams.checkObjectNotNull(source);
        return super.send(apiService.sendGiftClaimIssued(source));
    }

    /**
     * Forced expiration gift pack.
     * @param giftSourceQrCode The unique CODE of the gift source
     */
    @Override
    public ResponseGiftSourceExpire sendGiftInfoForceExpire(String giftSourceQrCode) {
        RequestGiftSource source=new RequestGiftSource(giftSourceQrCode);
        CheckParams.checkObjectNotNull(source);
        return super.send(apiService.sendGiftInfoForceExpire(source));
    }
}
