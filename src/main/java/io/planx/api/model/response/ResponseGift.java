package io.planx.api.model.response;



/**
 * @Author Todd
 * @Version 1.0
 **/
public class ResponseGift {
    /**
     * The unique identifier of the gift
     */
    private String giftId;
    /**
     * The unique identifier of the capital pool
     */
    private String poolId;
    /**
     * Account ID
     */
    private String userName;
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
     * Claim token name
     */
    private String claimSymbol;
    /**
     * Number of tokens received
     */
    private String claimAmount;
    /**
     * Receive user ID
     */
    private String claimUserName;
    /**
     * Receive time
     */
    private String claimTime;
    /**
     * The unique CODE of the gift
     */
    private String qrcode;
    /**
     * GIFT pickup address
     */
    private String giftLink;
    /**
     * Gift status
     * [ApiVars.GIFT_STATUS_WAITING,ApiVars.GIFT_STATUS_ISSUED,ApiVars.GIFT_STATUS_CLAIMED,ApiVars.GIFT_STATUS_CANCEL,ApiVars.GIFT_STATUS_EXPIRED]
     */
    private String giftStatus;
    /**
     * The 10-digit second-level timestamp of this operation
     */
    private Long expiresTime;

    public String getGiftId() {
        return giftId;
    }

    public void setGiftId(String giftId) {
        this.giftId = giftId;
    }

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

    public String getClaimSymbol() {
        return claimSymbol;
    }

    public void setClaimSymbol(String claimSymbol) {
        this.claimSymbol = claimSymbol;
    }

    public String getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(String claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getClaimUserName() {
        return claimUserName;
    }

    public void setClaimUserName(String claimUserName) {
        this.claimUserName = claimUserName;
    }

    public String getClaimTime() {
        return claimTime;
    }

    public void setClaimTime(String claimTime) {
        this.claimTime = claimTime;
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
