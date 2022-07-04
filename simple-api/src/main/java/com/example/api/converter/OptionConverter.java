package com.example.api.converter;

import com.example.api.dto.OptionDTO;
import com.example.api.vo.TestVO;
import com.example.core.base.Converter;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/4
 */
@org.mapstruct.Mapper
public interface OptionConverter extends Converter<OptionDTO, TestVO> {

    OptionConverter INSTANCE = Mappers.getMapper(OptionConverter.class);

    /**
     * 数据
     *
     * @param dto dto
     * @return {@link TestVO}
     */
    @Override
    @Mappings({
            @Mapping(target = "value", source = "label"),
            @Mapping(target = "code", source = "value")
    })
    TestVO toData(OptionDTO dto);
}
