package com.example.core.context;

import java.io.File;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/3
 */
public interface WebContexts {

    String X_FORWARDED_FOR = "x-forwarded-for";

    String HTTPS = "https://";

    String WEBSOCKET = "/websocket";

    String SLASH = File.separator;

}
