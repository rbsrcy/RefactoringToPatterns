package com.zsy.demo.rtp.decorator;

/**
 * Created by zhuoshangyi on 2016/10/15.
 */
public interface NodeIterator {
    /**
     * Check if more nodes are available.
     *
     * @return <code>true</code> if a call to <code>nextHTMLNode()</code> will succeed.
     */
    boolean hasMoreNodes() throws ParserException;

    /**
     * Get the next node.
     *
     * @return The next node in the HTML stream, or null if there are no more nodes.
     */
    Node nextNode() throws ParserException;
}
