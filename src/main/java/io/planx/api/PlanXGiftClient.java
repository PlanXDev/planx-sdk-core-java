package io.planx.api;

import io.planx.api.model.response.*;


import java.util.List;

public interface PlanXGiftClient {
    ResponseGiftSourceInfo sendGiftSourceInfoNew(String poolId, String giftName, String giftType, Integer quantity,
                                                 String priceAmount,Long expiresSeconds);

    List<ResponseGift> getGiftClaimWaiting();

    ResponseGiftSourceDetail getGiftSourceInfoDetail(String giftSourceQrCode);

    List<ResponseGiftSourceDetail> getGiftSourceInfoBatch(String[] giftSourceQrCodes);

    List<ResponseGift> getGiftClaimInfoBatch(String giftSourceQrCode,String[] giftQrCode);

    ResponseIssuedGift sendGiftClaimIssued(String giftSourceQrCode);

    ResponseGiftSourceExpire sendGiftInfoForceExpire(String giftSourceQrCode);
}
