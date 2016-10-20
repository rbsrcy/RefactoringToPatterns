package com.zsy.demo.rtp.decorator;

/**
 * Created by zhuoshangyi on 2016/10/6.
 */
public class AbstractNode implements Node {
    private int nodeBegin;
    private int nodeEnd;

    @Override
    public String toPlainTestString() {
        return null;
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

    public int getNodeBegin() {
        return nodeBegin;
    }

    public void setNodeBegin(int nodeBegin) {
        this.nodeBegin = nodeBegin;
    }

    public int getNodeEnd() {
        return nodeEnd;
    }

    public void setNodeEnd(int nodeEnd) {
        this.nodeEnd = nodeEnd;
    }
}
