package com.example.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/3
 */
@Data
public class OptionDTO implements Serializable {
    private static final long serialVersionUID = 6459867533736243565L;

    private Integer value;
    private String label;
}
