package com.aliyun.api.console.isv.request;

import com.aliyun.api.console.isv.model.*;
import com.aliyun.api.console.isv.response.BaseResponse;

/**
 * @Author: wenheng
 * @Date: 2019/12/2 3:21 PM
 */
public interface AppService {

    /**
     * 实例生产回调
     * <p>
     * 通过云市场售卖的商品，在用户购买时，由云市场主动发起调用 随后开始通过 afterCreateInstance 轮训实例生产状态，成功后轮训结束！ 超过120次调用如果最终失败，由 ISV 在云市场后台重置生产消息通知
     */
    public BaseResponse beforeCreateInstance(BeforeCreateInstanceCallBackRequest request);

    public BaseResponse afterCreateInstance(AfterCreateInstanceCallBackRequest request);

    /**
     * 会在前端主动发起调用 checkApplicationAlreadyInit 以检查当前用户是否已经初始化 如果接口返回当前用户未初始化则调用 initApplication 触发初始化任务 然后每隔 5s
     * 调用checkApplicationInitStatus 60次后失败，提醒用户重试 并重新触发 initApplication接口 然后再调用 checkApplicationInitStatus 直到成功
     */
    public BaseResponse checkApplicationAlreadyInit(CallBackBaseRequest request);

    public BaseResponse initApplication(CallBackBaseRequest request);

    public BaseResponse checkApplicationInitStatus(CallBackBaseRequest request);

    /**
     * 实例续费回调
     * <p>
     * 通过云市场售卖的商品，在用户续费时，由云市场主动发起调用 随后开始通过 afterRenewInstance 轮训实例续费状态，成功后轮训结束！ 超过120次调用如果最终失败，由 ISV 在云市场后台重置生产消息通知
     */
    public BaseResponse beforeRenewInstance(BeforeRenewInstanceCallBackRequest request);

    public BaseResponse afterRenewInstance(AfterRenewInstanceCallBackRequest request);

    /**
     * 实例过期回调
     * <p>
     * 通过云市场售卖的商品，在实例过期时，由云市场主动发起调用 随后开始通过 afterExpiredInstance 轮训实例过期状态，成功后轮训结束！ 超过120次调用如果最终失败，由 ISV 在云市场后台重置生产消息通知
     */
    public BaseResponse beforeExpiredInstance(BeforeExpiredInstanceCallBackRequest request);

    public BaseResponse afterExpiredInstance(AfterExpiredInstanceCallBackRequest request);

    /**
     * 实例释放回调
     * <p>
     * 通过云市场售卖的商品，在用户释放时，由云市场主动发起调用 随后开始通过 afterReleaseInstance 轮训实例释放状态，成功后轮训结束！ 超过120次调用如果最终失败，由 ISV 在云市场后台重置生产消息通知
     */
    public BaseResponse beforeReleaseInstance(BeforeReleaseInstanceCallBackRequest request);

    public BaseResponse afterReleaseInstance(AfterReleaseInstanceCallBackRequest request);

    /**
     * 实例升级回调
     * <p>
     * 通过云市场售卖的商品，在用户升级时，由云市场主动发起调用 随后开始通过 afterUpgradeInstance 轮训实例升级状态，成功后轮训结束！ 超过120次调用如果最终失败，由 ISV 在云市场后台重置生产消息通知
     */
    public BaseResponse beforeUpgradeInstance(BeforeUpgradeInstanceCallBackRequest request);

    public BaseResponse afterUpgradeInstance(AfterUpgradeInstanceCallBackRequest request);

    /**
     * 插件启动回调
     * <p>
     * 当用户在应用中心控制台操作启动服务时，由应用中心先调用此接口，isv 开始执行服务启动指令； 随后通过 afterStartInstance 轮训服务最新状态，成功后轮训流程完毕！(最多调用120次)
     */
    public BaseResponse beforeStartInstance(BeforeStartInstanceCallBackRequest request);

    public BaseResponse afterStartInstance(AfterStartInstanceCallBackRequest request);

    /**
     * 插件停止回调
     * <p>
     * 当用户在应用中心控制台操作停止服务时，由应用中心先调用此接口，isv 开始执行服务停止指令； 随后通过 afterStopInstance 轮训服务最新状态，成功后轮训流程完毕！(最多调用120次)
     */
    public BaseResponse beforeStopInstance(BeforeStopInstanceCallBackRequest request);

    public BaseResponse afterStopInstance(AfterStopInstanceCallBackRequest request);

}
