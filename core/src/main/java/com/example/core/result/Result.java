package com.example.core.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/3
 */
@AllArgsConstructor
@Getter
public class Result<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    private Result(){

    }
}
