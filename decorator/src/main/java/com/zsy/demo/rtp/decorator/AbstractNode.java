package com.zsy.demo.rtp.decorator;

/**
 * Created by zhuoshangyi on 2016/10/6.
 */
public class AbstractNode implements Node {
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
}
