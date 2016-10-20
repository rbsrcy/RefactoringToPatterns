package com.zsy.demo.rtp.decorator;

/**
 * Created by zhuoshangyi on 2016/10/15.
 */
public class StringNode extends AbstractNode {
    private boolean shouldDecode = false;
    private StringBuffer textBuffer;
    private int textBegin;
    private int textEnd;

    public StringNode(StringBuffer textBuffer, int textBegin, int textEnd) {
        this.textBuffer = textBuffer;
        this.textBegin = textBegin;
        this.textEnd = textEnd;
    }

    public StringNode(StringBuffer textBuffer, int textBegin, int textEnd, boolean shouldDecode) {
        this(textBuffer, textBegin, textEnd);
        this.shouldDecode = shouldDecode;
    }

    @Override
    public String toPlainTestString() {
        String result = textBuffer.substring(textBegin, textEnd);
        if (shouldDecode)
            result = Translate.decode(result);
        return result;
    }

    public String getText() {
        return textBuffer.toString();
    }

    public void setText(String text) {
        this.textBuffer = new StringBuffer(text);
    }
}
