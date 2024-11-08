package io.planx.api.model.request;

import io.planx.api.core.annotation.NotBlank;
import io.planx.api.core.annotation.NotNull;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class RequestGiftBatch {
    /**
     * The unique CODE of the gift source
     */
    @NotBlank
    private String giftSourceQrCode;
    /**
     * The unique CODE of the gift
     */
    @NotNull
    private String[] giftQrCode;

    public RequestGiftBatch() {
    }

    public RequestGiftBatch(String giftSourceQrCode, String[] giftQrCode) {
        this.giftSourceQrCode = giftSourceQrCode;
        this.giftQrCode = giftQrCode;
    }

    public String getGiftSourceQrCode() {
        return giftSourceQrCode;
    }

    public void setGiftSourceQrCode(String giftSourceQrCode) {
        this.giftSourceQrCode = giftSourceQrCode;
    }

    public String[] getGiftQrCode() {
        return giftQrCode;
    }

    public void setGiftQrCode(String[] giftQrCode) {
        this.giftQrCode = giftQrCode;
    }
}
