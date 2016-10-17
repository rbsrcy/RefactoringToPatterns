package com.zsy.demo.rtp.decorator;

/**
 * Created by zhuoshangyi on 2016/10/15.
 */
public class IteratorImpl implements NodeIterator {


    private NodeReader reader;

    public IteratorImpl(NodeReader reader) {
        this.reader = reader;

    }

    @Override
    public boolean hasMoreNodes() throws ParserException {
        return reader.getParser().hasMoreNodes();
    }

    @Override
    public Node nextNode() throws ParserException {
        return reader.getParser().find(reader, " ", 1, false);
    }
}
