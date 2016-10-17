package com.zsy.demo.rtp.decorator;

/**
 * Created by zhuoshangyi on 2016/10/15.
 */
public class StringParser extends Parser {
    private StringBuffer textBuffer;
    private int textBegin;
    private int textEnd;

    private StringParser(String encodedTitle) {
        super();
        textBuffer = new StringBuffer(encodedTitle);
        textBegin = 0;
        textEnd = 0;
    }


    public static Parser createParser(String encodedTitle) {
        return new StringParser(encodedTitle);
    }


    @Override
    public Node find(NodeReader reader, String input, int position, boolean balance_quotes) {
        textEnd = textBuffer.length();
        return new StringNode(textBuffer, textBegin, textEnd, reader.getParser().shouldDecodeNodes());

    }

    @Override
    public boolean hasMoreNodes() {
        return textBuffer.length() > textEnd ? true : false;
    }


}
