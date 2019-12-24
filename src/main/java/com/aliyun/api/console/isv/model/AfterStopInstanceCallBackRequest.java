package com.aliyun.api.console.isv.model;

public class AfterStopInstanceCallBackRequest extends CallBackBaseRequest {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4777531966710275854L;
	
	// 实例id(就是沿用云市场建议的orderBizId)
	private String instanceId;

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
}
