package com.example.api.controller;

import com.example.api.dto.OptionDTO;
import com.example.api.service.SystemService;
import com.example.api.vo.TestVO;
import com.example.core.exception.CustomException;
import com.example.core.result.Result;
import com.example.core.result.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/3
 */
@RestController
@RequestMapping("/sys")
public class SystemController {


    @Autowired
    private SystemService systemService;

    @GetMapping("/test")
    public Result<String> test() {
        return ResultFactory.buildSuccess("test");
    }

    @PostMapping("/test/post")
    public Result<TestVO> testPost(@RequestBody OptionDTO dto) {
        TestVO result = systemService.test(dto);
        return ResultFactory.buildSuccess(result);
    }

    @GetMapping("/test/err")
    public Result<String> test1() {
       throw new CustomException("error");
    }

    @GetMapping("/test/e")
    public Result<String> testE() {
        String s = null;
        return ResultFactory.buildSuccess(s.toLowerCase());
    }


}

