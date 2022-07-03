package com.example.common.utils;

import java.util.Random;

/**
 * @description:
 * @author: zhh
 * @time: 2022/7/3
 */
public class RandomUtils {
    /**
     * 生成随机字符
     *
     * @param length 生成随机字符的长度
     * @return {@link String}
     */
    public static String getRandomString(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    /**
     * 得到随机整数
     *
     * @param length 长度
     * @return {@link Integer}
     */
    public static Integer getRandomInt(int length){
        String num = "1234567890";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(num.length());
            sb.append(num.charAt(number));
        }
        return Integer.parseInt(sb.toString());
    }

}
