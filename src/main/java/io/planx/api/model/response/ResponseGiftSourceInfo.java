package io.planx.api.model.response;



/**
 * @Author Todd
 * @Version 1.0
 **/
public class ResponseGiftSourceInfo {
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
     * Token name on the left
     */
    private String sourceSymbol;
    /**
     * Token name on the right
     */
    private String targetSymbol;
    /**
     * The amount of tokens on the left
     */
    private String sourceAmount;
    /**
     * The amount of tokens on the right
     */
    private String targetAmount;
    /**
     * Service fee
     */
    private String serviceFee;

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

    public String getSourceSymbol() {
        return sourceSymbol;
    }

    public void setSourceSymbol(String sourceSymbol) {
        this.sourceSymbol = sourceSymbol;
    }

    public String getTargetSymbol() {
        return targetSymbol;
    }

    public void setTargetSymbol(String targetSymbol) {
        this.targetSymbol = targetSymbol;
    }

    public String getSourceAmount() {
        return sourceAmount;
    }

    public void setSourceAmount(String sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    public String getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(String targetAmount) {
        this.targetAmount = targetAmount;
    }

    public String getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(String serviceFee) {
        this.serviceFee = serviceFee;
    }
}
