package com.aliyun.api.console.isv.response;

import java.io.Serializable;

/**
 * @author wenheng
 * @date 2019/12/05
 */
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = -4772288348504043218L;

    /**
     * 链路ID
     */
    private String traceId;

    /**
     * 业务请求ID,如果是调用POP,则使用POP返回的requestId
     */
    private String requestId;

    /**
     * 业务返回是否成功
     */
    private Boolean success = true;

    /**
     * 错误code 默认值200表示无错误
     */
    private String code = "200";

    /**
     * 错误信息
     */
    private String message;

    /**
     * 业务数据
     */
    private T data;

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
