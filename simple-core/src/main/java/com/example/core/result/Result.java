package com.example.core.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/3
 */
@AllArgsConstructor
@Getter
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    private Result(){

    }
}
