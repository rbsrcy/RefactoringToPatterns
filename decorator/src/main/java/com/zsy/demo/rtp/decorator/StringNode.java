package com.zsy.demo.rtp.decorator;

/**
 * Created by zhuoshangyi on 2016/10/15.
 */
public class StringNode implements Node {
    private boolean shouldDecodeNodes = false;
    private StringBuffer textBuffer;
    private int textBegin;
    private int textEnd;

    public StringNode(StringBuffer textBuffer, int textBegin, int textEnd) {
        this.textBuffer = textBuffer;
        this.textBegin = textBegin;
        this.textEnd = textEnd;
    }

    public StringNode(StringBuffer textBuffer, int textBegin, int textEnd, boolean shouldDecodeNodes) {
        this(textBuffer, textBegin, textEnd);
        this.shouldDecodeNodes = shouldDecodeNodes;
    }

    @Override
    public String toPlainTestString() {
        String result = textBuffer.substring(textBegin, textEnd);
        if (shouldDecodeNodes)
            result = Translate.decode(result);
        return result;
    }

    @Override
    public String toHtml() {
        return null;
    }

    @Override
    public void collectInto(NodeList nodes, String filter) {

    }

    @Override
    public void collectInto(NodeList nodes, Class nodeType) {

    }

    @Override
    public int elementBegin() {
        return 0;
    }

    @Override
    public int elememtEnd() {
        return 0;
    }

    @Override
    public void accept(Node visitor) {

    }

    @Override
    public void setParent(CompositeTag tag) {

    }

    @Override
    public CompositeTag getParent() {
        return null;
    }

    public StringBuffer getText() {
        return textBuffer;
    }

    public void setText(StringBuffer textBuffer) {
        this.textBuffer = textBuffer;
    }
}
