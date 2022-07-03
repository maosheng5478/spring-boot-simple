package com.example.core.base;

import cn.hutool.core.net.Ipv4Util;
import com.example.core.context.WebContexts;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/3
 */
public class BaseController {
    private final String windows = "Windows NT";

    /**
     * 获取request对象
     *
     * @return
     */
    public HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }

    /**
     * 获取请求token
     * @return
     */
    public String getHeaderToken(){
        String token = getRequest().getHeader("token");
        return "null".equals(token) ? null : token;
    }

    /**
     * 获取客户端Ip
     *
     * @return ip
     */
    public String getClientIp(){
        HttpServletRequest request = getRequest();
        if (request.getHeader(WebContexts.X_FORWARDED_FOR) == null) {
            return request.getRemoteAddr();
        }
        return request.getHeader(WebContexts.X_FORWARDED_FOR);
    }

    /**
     * 判断请求来源
     *
     * @return 结果
     */
    public String getTerminal(){
        HttpServletRequest request = getRequest();
        String terminal = request.getHeader("User-Agent");
        if(terminal.contains(windows)){
            terminal = "pc";
        }else{
            terminal = "mobile";
        }
        return terminal;
    }
}
