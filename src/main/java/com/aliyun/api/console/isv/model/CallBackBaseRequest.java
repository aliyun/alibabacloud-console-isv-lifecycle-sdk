package com.aliyun.api.console.isv.model;

/**
 * @Author: wenheng
 * @Date: 2019/12/2 3:49 PM
 */
public class CallBackBaseRequest extends BaseRequest {

    private static final long serialVersionUID = 5147331835436963502L;

    /**
     * 用户中心商品唯一识别码
     */
    private String appCode;
    
    /**
     * 用户中心商品唯一识别码 alias
     */
    private String appAliasCode;

    /**
     * 用户中心isv唯一识别码
     */
    private String isvCode;
    
    /**
     * 挂载的小程序id
     */
    private String miniAppId;

    // 1.partner：BID帐号 2. customer：云账号 3. sub：RAM子用户 4. AssumedRoleUser：STS Token临时身份
    private String callerType;

    //用户uid，当使用STSToken登录时，此参数不下传至底层
    private Long callerUid;

    // 当callerType= sub时，为主账号ID，其余类型此字段为空，当使用STSToken登录时，此参数不下传至底层
    private Long callerParentId;

    // 当callerType= sts时，为角色Id
    private String roleId;

    // 当callerType= sts时，为角色name
    private String roleName;

    public CallBackBaseRequest() {
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getIsvCode() {
        return isvCode;
    }

    public void setIsvCode(String isvCode) {
        this.isvCode = isvCode;
    }

    public String getCallerType() {
        return callerType;
    }

    public void setCallerType(String callerType) {
        this.callerType = callerType;
    }

    public Long getCallerUid() {
        return callerUid;
    }

    public void setCallerUid(Long callerUid) {
        this.callerUid = callerUid;
    }

    public Long getCallerParentId() {
        return callerParentId;
    }

    public void setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
	public String getAppAliasCode() {
		return appAliasCode;
	}

	public void setAppAliasCode(String appAliasCode) {
		this.appAliasCode = appAliasCode;
	}
    
	public String getMiniAppId() {
		return miniAppId;
	}

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
}
