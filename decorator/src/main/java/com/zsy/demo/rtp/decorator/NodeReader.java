package com.zsy.demo.rtp.decorator;


/**
 * Created by zhuoshangyi on 2016/10/15.
 */
public class NodeReader {
    private Parser parser;

    public NodeReader(Parser parser) {
        this.parser = parser;
    }

    public Parser getParser() {
        return parser;
    }
}
