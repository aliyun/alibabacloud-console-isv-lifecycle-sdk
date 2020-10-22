package com.aliyun.api.console.isv.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class BeforeCreateInstanceCallBackRequest extends CallBackBaseRequest {
    /**
     *
     */
    private static final long serialVersionUID = -1000037932658148225L;

    // 实例id(就是沿用云市场建议的orderBizId)
    private String instanceId;

    // 云市场订单ID
    private String orderId;

    // 云市场商品code
    private String productCode;

    // 商品规格标识
    private String skuId;

    // 过期时间(yyyy-MM-dd HH:mm:ss)
    @JSONField(format="yyyy-MM-dd HH:mm:ss.SSS")
    private Date expiredOn;
    
    // 是否是试用
	private Boolean trial;

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the productCode
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * @param productCode the productCode to set
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * @return the skuId
     */
    public String getSkuId() {
        return skuId;
    }

    /**
     * @param skuId the skuId to set
     */
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    /**
     * @return the expiredOn
     */
    public Date getExpiredOn() {
        return expiredOn;
    }

    /**
     * @param expiredOn the expiredOn to set
     */
    public void setExpiredOn(Date expiredOn) {
        this.expiredOn = expiredOn;
    }

    /**
     * @return the instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * @param instanceId the instanceId to set
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
	 * @return the trial
	 */
	public Boolean getTrial() {
		return trial;
	}

	/**
	 * @param trial the trial to set
	 */
	public void setTrial(Boolean trial) {
		this.trial = trial;
	}

}
