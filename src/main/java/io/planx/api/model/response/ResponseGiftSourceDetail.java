package io.planx.api.model.response;



/**
 * @Author Todd
 * @Version 1.0
 **/
public class ResponseGiftSourceDetail {
    /**
     * The unique identifier of the capital pool
     */
    private String poolId;
    /**
     * Account ID
     */
    private String userName;
    /**
     * The unique identifier of the gift source
     */
    private String giftSourceId;
    /**
     * The unique CODE of the gift source
     */
    private String qrcode;
    /**
     * GIFT pickup address
     */
    private String giftLink;
    /**
     * GIFT pickup address
     */
    private String giftClaimLink;
    /**
     * Gift name
     */
    private String giftName;
    /**
     * Gift type [ApiVars.GIFT_TYPE_AIRDROP,ApiVars.GIFT_TYPE_REDEMPTION]
     */
    private String giftType;
    /**
     * Generate quantity
     */
    private int quantity;
    /**
     * Number of tokens for a single Gift
     */
    private String priceAmount;
    /**
     * Quantity issued
     */
    private int issuedQuantity;
    /**
     * The number of received
     */
    private int receiveQuantity;
    /**
     * Gift status
     * [ApiVars.GIFT_STATUS_WAITING,ApiVars.GIFT_STATUS_CANCEL,ApiVars.GIFT_STATUS_EXPIRED]
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getGiftLink() {
        return giftLink;
    }

    public void setGiftLink(String giftLink) {
        this.giftLink = giftLink;
    }

    public String getGiftClaimLink() {
        return giftClaimLink;
    }

    public void setGiftClaimLink(String giftClaimLink) {
        this.giftClaimLink = giftClaimLink;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getGiftType() {
        return giftType;
    }

    public void setGiftType(String giftType) {
        this.giftType = giftType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(String priceAmount) {
        this.priceAmount = priceAmount;
    }

    public int getIssuedQuantity() {
        return issuedQuantity;
    }

    public void setIssuedQuantity(int issuedQuantity) {
        this.issuedQuantity = issuedQuantity;
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
