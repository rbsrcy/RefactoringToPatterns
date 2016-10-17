package com.zsy.demo.rtp.decorator;

/**
 * Created by zhuoshangyi on 2016/10/15.
 */
public class Translate {
    public static String decode(String text) {
        return text.replaceAll("\\&amp;", "&");
    }
}
