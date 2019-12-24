package com.aliyun.api.console.isv.model;

public class AfterReleaseInstanceCallBackRequest extends CallBackBaseRequest {

    /**
     *
     */
    private static final long serialVersionUID = 1865604848440750673L;
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
