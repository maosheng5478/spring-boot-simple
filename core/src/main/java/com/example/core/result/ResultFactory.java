package com.example.core.result;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/3
 */
public class ResultFactory {

    private ResultFactory() {

    }

    public static Result<String> buildSuccess() {
        return buildSuccess("");
    }

    public static <T> Result<T> buildSuccess(T data) {
        return buildResult(ResultCode.SUCCESS, "success", data);
    }

    public static Result<String> buildUnauthorized(String data) {
        return buildResult(ResultCode.UNAUTHORIZED, ResultCode.UNAUTHORIZED, data);
    }

    public static Result<String> buildFail(String message) {
        return buildResult(ResultCode.FAIL, message, "");
    }

    public static <T> Result<T> buildResult(ResultCode resultCode, String message, T data) {
        return buildResult(resultCode.getCode(), message, data);
    }

    public static Result<String> buildResult(ResultCode resultCode, ResultCode resultString) {
        return buildResult(resultCode, resultString.getInfo(), "");
    }

    public static <T> Result<T> buildResult(ResultCode resultCode, ResultCode resultString, T data) {
        return buildResult(resultCode.getCode(), resultString.getInfo(), data);
    }

    public static Result<String> buildResult(ResultCode resultCode, String message) {
        return buildResult(resultCode, message, "");
    }

    public static <T> Result<T> buildResult(Integer code, String msg, T data) {
        return new Result<>(code, msg, data);
    }
}
