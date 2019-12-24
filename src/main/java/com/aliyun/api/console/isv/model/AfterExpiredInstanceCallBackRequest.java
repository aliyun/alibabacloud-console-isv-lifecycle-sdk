package com.aliyun.api.console.isv.model;

public class AfterExpiredInstanceCallBackRequest extends CallBackBaseRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8554035984243688868L;
	// 实例ID
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
