package com.example.core.base;

import com.example.core.context.DigitalContexts;
import lombok.ToString;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/3
 */
@ToString
public class BaseDTO {

    private Integer page;
    private Integer size;

    public Integer getPage() {
        if (page <= DigitalContexts.ZERO){
            page = DigitalContexts.ONE;
        }
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        if (size <= DigitalContexts.ZERO){
            size = DigitalContexts.FIVE;
        }
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    public BaseDTO(){
        this.size = DigitalContexts.FIVE;
        this.page = DigitalContexts.ONE;
    }

    public BaseDTO(Integer size, Integer page){
        if (size > DigitalContexts.ONE && page > DigitalContexts.ONE){
            this.size = size;
            this.page = page;
        }else {
            this.size = DigitalContexts.ONE;
            this.page = DigitalContexts.FIVE;
        }
    }
}
