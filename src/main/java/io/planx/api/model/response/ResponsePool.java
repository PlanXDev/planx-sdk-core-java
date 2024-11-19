package io.planx.api.model.response;



/**
 * @Author Todd
 * @Version 1.0
 **/
public class ResponsePool {
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
     * The original amount of tokens on the left
     */
    private String sourceOriginalAmount;
    /**
     * The original amount of tokens on the right
     */
    private String targetOriginalAmount;
    /**
     * The amount of tokens on the left
     */
    private String sourceAmount;
    /**
     * The amount of tokens on the right
     */
    private String targetAmount;
    /**
     * The amount of tokens used on the left
     */
    private String sourceDealAmount;
    /**
     * The amount of tokens used on the right
     */
    private String targetDealAmount;
    /**
     * Pool status [ApiVars.POOL_STATUS_ACTIVE,ApiVars.POOL_STATUS_INACTIVE,ApiVars.POOL_STATUS_DESTROY]
     */
    private String poolStatus;

    /**
     * The 10-digit second-level timestamp of this operation
     */
    private Long createTime;

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

    public String getSourceOriginalAmount() {
        return sourceOriginalAmount;
    }

    public void setSourceOriginalAmount(String sourceOriginalAmount) {
        this.sourceOriginalAmount = sourceOriginalAmount;
    }

    public String getTargetOriginalAmount() {
        return targetOriginalAmount;
    }

    public void setTargetOriginalAmount(String targetOriginalAmount) {
        this.targetOriginalAmount = targetOriginalAmount;
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

    public String getSourceDealAmount() {
        return sourceDealAmount;
    }

    public void setSourceDealAmount(String sourceDealAmount) {
        this.sourceDealAmount = sourceDealAmount;
    }

    public String getTargetDealAmount() {
        return targetDealAmount;
    }

    public void setTargetDealAmount(String targetDealAmount) {
        this.targetDealAmount = targetDealAmount;
    }

    public String getPoolStatus() {
        return poolStatus;
    }

    public void setPoolStatus(String poolStatus) {
        this.poolStatus = poolStatus;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
