package com.aliyun.api.console.isv.model;

import java.io.Serializable;

/**
 * @Author: wenheng
 * @Date: 2019/12/2 3:49 PM
 */
public class BaseRequest implements Serializable {

    private static final long serialVersionUID = 5147531835436963502L;

    /**
     * traceId 用于日志跟踪
     */
    private String traceId;

    /**
     *
     * accountInfo 用户传递用户信息
     */
    private String accountInfo;

    /**
     * 要路由的reigonId
     * @return
     */
    private String region;


    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getAccountInfo() {
        return accountInfo;
    }

    public void setAccountInfo(String accountInfo) {
        this.accountInfo = accountInfo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
