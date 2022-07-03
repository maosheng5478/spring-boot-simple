package com.example.core.result;

import lombok.Getter;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/3
 */
@Getter
public enum ResultCode {

    /**
     *  响应枚举
     */
    NOT_FOUND(404, "未找到接口"),

    SUCCESS(200, "成功"),

    FAIL(400, "失败"),

    FORBIDDEN(403,"禁止访问"),

    UNAUTHORIZED(401,"认证异常"),

    INTERNAL_SERVER_ERROR(500,"服务器内部错误");
    private final Integer code;
    private final String info;

    ResultCode(int code, String info) {
        this.code = code;
        this.info = info;
    }

}
