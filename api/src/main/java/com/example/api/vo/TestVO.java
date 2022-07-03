package com.example.api.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/3
 */
@Data
public class TestVO implements Serializable {

    private static final long serialVersionUID = -5737867136382685305L;

    private String value;
    private Integer code;
}
