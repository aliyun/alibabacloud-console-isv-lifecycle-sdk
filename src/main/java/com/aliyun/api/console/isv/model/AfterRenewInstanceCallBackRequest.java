package com.aliyun.api.console.isv.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class AfterRenewInstanceCallBackRequest extends CallBackBaseRequest {

    /**
     *
     */
    private static final long serialVersionUID = -4438570788594757453L;
    // 实例ID
    private String instanceId;

    // 云市场订单ID
    private String orderId;

    // 过期时间（yyyy-MM-dd HH:mm:ss）
    @JSONField(format="yyyy-MM-dd HH:mm:ss.SSS")
    private Date expiredOn;

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
}
