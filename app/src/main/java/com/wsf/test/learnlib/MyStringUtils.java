package com.wsf.test.learnlib;

/**
 * Created by Shufeng.Wu on 2018/1/19.
 * 測試使用類方法
 */

public class MyStringUtils {
    public static String capitalize(final String word) {
        if (word.length() > 1) {
            return String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
        }
        return word;
    }

}
