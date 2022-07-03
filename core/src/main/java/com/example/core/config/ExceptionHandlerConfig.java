package com.example.core.config;

import com.example.core.exception.CustomException;
import com.example.core.result.Result;
import com.example.core.result.ResultCode;
import com.example.core.result.ResultFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/3
 */
@ControllerAdvice
@Slf4j
public class ExceptionHandlerConfig {

    /**
     * 处理自定义异常
     *
     * @param e e
     * @return {@link Result}<{@link String}> 400
     */
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public Result<String> handleCustomException(CustomException e) {
        log.error(e.getMessage(), e);
        return ResultFactory.buildFail(e.getMessage());
    }

    /**
     * 处理异常
     *
     * @param e e
     * @return {@link Result}<{@link String}> 500
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result<String> handleException(Exception e) {
        log.error(e.getMessage(), e);
        if (e instanceof NoHandlerFoundException) {
            return ResultFactory.buildResult(ResultCode.NOT_FOUND, ResultCode.NOT_FOUND);
        }
        return ResultFactory.buildResult(ResultCode.INTERNAL_SERVER_ERROR, ResultCode.INTERNAL_SERVER_ERROR, e.getMessage());
    }

}
