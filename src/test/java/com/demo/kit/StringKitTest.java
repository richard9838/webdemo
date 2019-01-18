package com.demo.kit;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author coder
 */
public class StringKitTest {

    @Test
    public void testIsEmpty() {
        assertTrue(StringKit.isEmpty(null));
    }

}