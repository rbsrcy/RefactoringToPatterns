package com.zsy.demo.rtp.decorator;

/**
 * Created by zhuoshangyi on 2016/10/15.
 */
public class Parser {

    private boolean shouldDecodeNodes = false;


    protected Parser() {

    }


    public boolean shouldDecodeNodes() {
        return shouldDecodeNodes;
    }

    public void setNodeDecoding(boolean shouldDecodeNodes) {
        this.shouldDecodeNodes = shouldDecodeNodes;
    }

    public NodeIterator elements() throws ParserException {
        return (new IteratorImpl(new NodeReader(this)));
    }

    public Node find(NodeReader reader, String input, int position, boolean balance_quotes) {
        return null;
    }


    public boolean hasMoreNodes() {
        return false;
    }

}
