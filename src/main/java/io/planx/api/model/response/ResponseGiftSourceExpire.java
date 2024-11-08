package io.planx.api.model.response;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class ResponseGiftSourceExpire {
    /**
     * The unique identifier of the capital pool
     */
    private String poolId;
    /**
     * The unique identifier of the gift source
     */
    private String giftSourceId;
    /**
     * The unique CODE of the gift source
     */
    private String qrcode;
    /**
     * Generate quantity
     */
    private int quantity;
    /**
     * The number of expires
     */
    private int expiresQuantity;
    /**
     * The number of received
     */
    private int receiveQuantity;
    /**
     * Gift status,ApiVars.GIFT_STATUS_EXPIRED
     */
    private String giftStatus;
    /**
     * The 10-digit second-level timestamp of this operation
     */
    private Long expiresTime;

    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public String getGiftSourceId() {
        return giftSourceId;
    }

    public void setGiftSourceId(String giftSourceId) {
        this.giftSourceId = giftSourceId;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getExpiresQuantity() {
        return expiresQuantity;
    }

    public void setExpiresQuantity(int expiresQuantity) {
        this.expiresQuantity = expiresQuantity;
    }

    public int getReceiveQuantity() {
        return receiveQuantity;
    }

    public void setReceiveQuantity(int receiveQuantity) {
        this.receiveQuantity = receiveQuantity;
    }

    public String getGiftStatus() {
        return giftStatus;
    }

    public void setGiftStatus(String giftStatus) {
        this.giftStatus = giftStatus;
    }

    public Long getExpiresTime() {
        return expiresTime;
    }

    public void setExpiresTime(Long expiresTime) {
        this.expiresTime = expiresTime;
    }
}
