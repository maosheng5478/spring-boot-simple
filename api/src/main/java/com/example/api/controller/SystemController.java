package com.example.api.controller;

import com.example.core.result.Result;
import com.example.core.result.ResultFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/3
 */
@RestController
@RequestMapping("/sys")
public class SystemController {

    @GetMapping("/test")
    public Result<String> test() {
        return ResultFactory.buildResult(200, "success", "");
    }
}

