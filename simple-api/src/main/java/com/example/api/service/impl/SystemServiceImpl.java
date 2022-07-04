package com.example.api.service.impl;

import com.example.api.converter.OptionConverter;
import com.example.api.dto.OptionDTO;
import com.example.api.service.SystemService;
import com.example.api.vo.TestVO;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/4
 */
@Service
public class SystemServiceImpl implements SystemService {

    @Override
    public TestVO test(OptionDTO dto) {
        return OptionConverter.INSTANCE.toData(dto);
    }
}
