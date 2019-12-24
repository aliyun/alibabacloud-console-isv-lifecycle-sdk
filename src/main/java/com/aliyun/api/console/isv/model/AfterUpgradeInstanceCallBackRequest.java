package com.aliyun.api.console.isv.model;

public class AfterUpgradeInstanceCallBackRequest extends CallBackBaseRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7961845089572977968L;
	// 实例ID
	private String instanceId;
	
	// 商品规格id
	private String skuId;

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
}
