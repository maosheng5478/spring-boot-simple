package com.example.api.service;

import com.example.api.dto.OptionDTO;
import com.example.api.vo.TestVO;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/4
 */
public interface SystemService {

    /**
     * 测试
     *
     * @param dto dto
     * @return {@link TestVO}
     */
    TestVO test(OptionDTO dto);
}
