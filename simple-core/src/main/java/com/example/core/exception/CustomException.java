package com.example.core.exception;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/3
 */
public class CustomException extends RuntimeException{

    public CustomException(String msg) {
        super(msg);
    }

    public CustomException() {
        super();
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }
}
