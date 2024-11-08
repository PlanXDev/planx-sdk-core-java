package io.planx.api.model.request;

import io.planx.api.core.annotation.NotBlank;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class RequestGiftSource {
    /**
     * The unique CODE of the gift source
     */
    @NotBlank
    private String giftSourceQrCode;

    public RequestGiftSource() {
    }

    public RequestGiftSource(String giftSourceQrCode) {
        this.giftSourceQrCode = giftSourceQrCode;
    }

    public String getGiftSourceQrCode() {
        return giftSourceQrCode;
    }

    public void setGiftSourceQrCode(String giftSourceQrCode) {
        this.giftSourceQrCode = giftSourceQrCode;
    }
}
