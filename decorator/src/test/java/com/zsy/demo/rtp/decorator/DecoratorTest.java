package com.zsy.demo.rtp.decorator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhuoshangyi on 2016/10/15.
 */
public class DecoratorTest {


    @Test
    public void testDecodingAmpersand() throws Exception {
        String ENCODED_WORKSHOP_TITLE = "The Testing &amp; Refactoring Workshop";

        String DECODED_WORKSOP_TITLE = "The Testing & Refactoring Workshop";

        StringBuffer decodedContent = new StringBuffer();
        Parser parser = StringParser.createParser(ENCODED_WORKSHOP_TITLE);
        parser.setNodeDecoding(true);   //tell parser tod decode StringNodes

        NodeIterator nodes = parser.elements();

        while (nodes.hasMoreNodes()) {
            decodedContent.append(nodes.nextNode().toPlainTestString());
        }

        Assert.assertEquals("decoded content", DECODED_WORKSOP_TITLE, decodedContent.toString());
    }
}
