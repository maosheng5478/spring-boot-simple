package com.example.core.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/3
 */
@Component
@MapperScan("com.example.core.mapper")
public class MyBatisPlusConfig {
}
