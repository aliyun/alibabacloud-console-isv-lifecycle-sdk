### 简介
阿里云企业工作台上线应用的售卖依托于云市场进行售卖，用户对应用的新购、续费、变配、释放、过期依赖云市场的回调，用户对应用的启用和停用依赖企业工作台的回调。

### API概览
|  API   | 描述  |
|  ----  | ----  |
| beforeCreateInstance  | 新购 步骤 1 客户购买插件时调用|
| afterCreateInstance  | 新购 步骤 2 客户购买插件时调用|
| beforeRenewInstance  |  续费 步骤 1 客户续费插件时调用|
| afterRenewInstance  | 续费 步骤 2 客户续费插件时调用 |
| beforeExpiredInstance  |  过期 步骤 1 客户插件过期时调用 |
| afterExpiredInstance  | 过期 步骤 2  客户插件过期时调用|
| beforeReleaseInstance  |  释放 步骤 1 当插件过期15天后 会调用释放接口 |
| afterReleaseInstance  | 释放 步骤 2 当插件过期15天后 会调用释放接口|
| beforeUpgradeInstance  |  变配 步骤 1 客户变更插件规格时调用|
| afterUpgradeInstance  | 变配 步骤 2 客户变更插件规格时调用|
| beforeStartInstance  |  启用插件 步骤 1 客户启用插件时调用 |
| afterStartInstance  | 启用插件 步骤 2 客户启用插件时调用|
| beforeStopInstance  | 停用插件 步骤 1  客户停用插件时调用|
| afterStopInstance  | 停用插件 步骤 2 客户停用插件时调用|

#### PATH
当集成方式为工作台托管时 调用 API 的路径为 http://您的服务地址/api/${action} <br /> 
当集成方式为聚石塔托管时 调用 API 的路径为 http://您的服务地址/buy/${action} <br />

#### METHOD
GET

#### 返回结构：
正常返回：
> {"code": "200", success : true, traceId: "0bb61bca16027295143026356e0383"}

当返回此结果时，阿里云企业工作台认为 ISV 已经处理成功，流程会进入下一流程。 如当调用 beforeCreateInstance 返回此结果，则自动进入 afterCreateInstance 当 afterCreateInstance 也返回成功，则新购成功。

异常返回
> {"code": "UserForbidden", success: false, message: "此用户不允许购买本插件", traceId: "0bb61bca16027295143026356e0383"}

当返回此结果时，则认为当前请求不成功，一定时间后会再次请求，直到失败次数累计达 120 次。 如当调用 beforeCreateInstance 返回此结果，会一段时间过再次调用此接口，直到返回成功结果。

### 调用入参
#### 通用入参
|  参数   | 描述  |
|  ----  | ----  |
| appCode  | 云市场code |
| marketRequestParametersString  | 云市场回调参数，此参数中包含所有云市场包含参数 encode 过|
| appAliasCode  | 应用插件的别名 |
| isvCode  |  插件对应isv的别名 |
| miniAppId  | 插件对应的小程序Id 如有 |
| callerType  |  购买插件的账号类型 2. customer：云账号 （常见） 3. sub：RAM子用户 4. AssumedRoleUser：STS Token临时身份 （尚未支持） |
| callerUid  | 购买插件的 用户 UserId 核心参数|
| callerParentId  |  当callerType= sub时，为主账号ID，其余类型此字段为空 |
| roleId  | 当callerType= AssumedRoleUser，为角色Id 尚未支持|
| roleName  |  当callerType= AssumedRoleUser，为角色Name 尚未支持|
| traceId  |  随机字符串 用来定位一个请求 在请求返回时返回给企业工作台|

#### 新购 beforeCreateInstance & afterCreateInstance
|  参数   | 描述  |
|  ----  | ----  |
| instanceId  | 实例Id |
| orderId  | 订单Id |
| productCode  |  云市场code 与AppCode相同 |
| skuId  | 用户购买的规格 |
| expiredOn  |  插件的过期时间 格式为 yyyy-MM-dd HH:mm:ss.SSS |
| trial  | 是否为试用订单 |

#### 续费 beforeRenewInstance & afterRenewInstance
|  参数   | 描述  |
|  ----  | ----  |
| instanceId  | 实例Id |
| orderId  | 订单Id |
| expiredOn  |  插件的过期时间 格式为 yyyy-MM-dd HH:mm:ss.SSS |

#### 过期 beforeExpiredInstance & afterExpiredInstance
|  参数   | 描述  |
|  ----  | ----  |
| instanceId  | 实例Id |

#### 释放 beforeReleaseInstance & afterReleaseInstance
|  参数   | 描述  |
|  ----  | ----  |
| instanceId  | 实例Id |

#### 续费 beforeUpgradeInstance & afterUpgradeInstance
|  参数   | 描述  |
|  ----  | ----  |
| instanceId  | 实例Id |
| skuId  | 用户购买的规格 |

#### 停用 beforeStopInstance & afterStopInstance
|  参数   | 描述  |
|  ----  | ----  |
| instanceId  | 实例Id |

#### 启用 beforeStartInstance & afterStartInstance
|  参数   | 描述  |
|  ----  | ----  |
| instanceId  | 实例Id |


### 调用示例
> https://aliwork.test.cn/buy/afterCreateInstance?callerParentId=1111111111111111&traceId=0b0eccd016118678703871654ef4ba&orderId=222222222222222&appCode=cmgj00053252&expiredOn=2021-04-29+00%3A00%3A00.000&trial=true&instanceId=33884913&isvCode=UZiFMY8b&productCode=cmgj00053252&marketRequestParametersString=%7B%22productCode%22%3A%22cmgj00053252%22%2C%22package_version%22%3A%22yuncode3621600001%22%2C%22orderId%22%3A%22222222222222222%22%2C%22orderBizId%22%3A%2233884913%22%2C%22action%22%3A%22createInstance%22%2C%22aliUid%22%3A%221111111111111111%22%2C%22expiredOn%22%3A%222021-04-29+00%3A00%3A00%22%2C%22skuId%22%3A%22yuncode3621600001%22%2C%22trial%22%3A%22true%22%2C%22token%22%3A%22ddc1b006263a33cb65a5f1139cac2d2c%22%7D&callerType=2&appAliasCode=easycmdb&callerUid=1111111111111111&skuId=yuncode3621600001

#### 验签方式
示例中密钥为: 29ae1790-c00c-4321-a214-254fe79e2269

加密后的token为: ddc1b006263a33cb65a5f1139cac2d2c
##### 签名代码(java)
    private static String md5(String s) {
        try {
            MessageDigest DIGESTER = MessageDigest.getInstance("MD5");
            byte[] digest = DIGESTER.digest(s.getBytes());
            return bytesToString(digest);
        } catch (NoSuchAlgorithmException e) {
        }
        return null;
    }


    private static String bytesToString(byte[] data) {
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
            'e', 'f'};
        char[] temp = new char[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            byte b = data[i];
            temp[i * 2] = hexDigits[b >>> 4 & 0x0f];
            temp[i * 2 + 1] = hexDigits[b & 0x0f];
        }
        return new String(temp);
    }
