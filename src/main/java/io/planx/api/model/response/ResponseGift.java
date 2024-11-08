package io.planx.api.model.response;

import java.math.BigDecimal;

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
    private BigDecimal sourceAmount;
    /**
     * The amount of tokens on the right
     */
    private BigDecimal targetAmount;
    /**
     * Claim token name
     */
    private String claimSymbol;
    /**
     * Number of tokens received
     */
    private BigDecimal claimAmount;
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

    public BigDecimal getSourceAmount() {
        return sourceAmount;
    }

    public void setSourceAmount(BigDecimal sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    public BigDecimal getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(BigDecimal targetAmount) {
        this.targetAmount = targetAmount;
    }

    public String getClaimSymbol() {
        return claimSymbol;
    }

    public void setClaimSymbol(String claimSymbol) {
        this.claimSymbol = claimSymbol;
    }

    public BigDecimal getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(BigDecimal claimAmount) {
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
