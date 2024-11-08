package io.planx.api.model.request;

import io.planx.api.core.annotation.NotNull;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class RequestGiftSourceBatch {
    /**
     * The unique CODE of the gift source
     */
    @NotNull
    private String[] giftSourceQrCodes;

    public RequestGiftSourceBatch() {
    }

    public RequestGiftSourceBatch(String[] giftSourceQrCodes) {
        this.giftSourceQrCodes = giftSourceQrCodes;
    }

    public String[] getGiftSourceQrCodes() {
        return giftSourceQrCodes;
    }

    public void setGiftSourceQrCodes(String[] giftSourceQrCodes) {
        this.giftSourceQrCodes = giftSourceQrCodes;
    }
}
