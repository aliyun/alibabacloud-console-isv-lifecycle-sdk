package com.aliyun.api.console.isv.model;

/**
 * @Author: wenheng
 * @Date: 2019/12/2 3:49 PM
 */
public class CheckAppAuthRequest extends BaseRequest {

    private static final long serialVersionUID = 5147332835336963502L;

    /**
     * ISV的AppCode
     */
    private String appCode;

    public CheckAppAuthRequest() {
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }
}
