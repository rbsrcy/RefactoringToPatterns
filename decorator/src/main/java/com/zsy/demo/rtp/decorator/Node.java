package com.zsy.demo.rtp.decorator;

/**
 * Created by zhuoshangyi on 2016/10/6.
 */
public interface Node {
    String toPlainTestString();

    String toString();

    String toHtml();

    void collectInto(NodeList nodes, String filter);

    void collectInto(NodeList nodes, Class nodeType);

    int elementBegin();

    int elememtEnd();

    void accept(Node visitor);

    void setParent(CompositeTag tag);

    CompositeTag getParent();
}
