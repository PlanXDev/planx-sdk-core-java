package io.planx.api.model.request;

import io.planx.api.model.ApiVars;
import io.planx.api.core.annotation.Max;
import io.planx.api.core.annotation.Min;
import io.planx.api.core.annotation.NotBlank;
import io.planx.api.core.annotation.NotNull;



/**
 * @Author Todd
 * @Version 1.0
 **/
public class RequestNewTokenGiftSource {
    /**
     * The unique identifier of the capital pool
     */
    @NotBlank
    private String poolId;
    /**
     * Gift name
     */
    @NotBlank
    private String giftName;
    /**
     * Gift type [ApiVars.GIFT_TYPE_AIRDROP,ApiVars.GIFT_TYPE_REDEMPTION]
     */
    @NotBlank(eqs = {ApiVars.GIFT_TYPE_AIRDROP,ApiVars.GIFT_TYPE_REDEMPTION})
    private String giftType;
    /**
     * Generate quantity,1<=quantity<=2000
     */
    @NotNull
    @Min(1)
    @Max(2000)
    private Integer quantity;
    /**
     * Number of tokens for a single Gift
     */
    @NotNull
    @Min(eq = false)
    private String priceAmount;
    /**
     * Expiration time.Expires after specified number of seconds
     */
    @NotNull
    @Min(eq = false)
    private Long expiresSeconds;

    public RequestNewTokenGiftSource() {
    }

    public RequestNewTokenGiftSource(String poolId, String giftName, String giftType, Integer quantity, String priceAmount, Long expiresSeconds) {
        this.poolId = poolId;
        this.giftName = giftName;
        this.giftType = giftType;
        this.quantity = quantity;
        this.priceAmount = priceAmount;
        this.expiresSeconds = expiresSeconds;
    }

    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(String priceAmount) {
        this.priceAmount = priceAmount;
    }

    public Long getExpiresSeconds() {
        return expiresSeconds;
    }

    public void setExpiresSeconds(Long expiresSeconds) {
        this.expiresSeconds = expiresSeconds;
    }
}
