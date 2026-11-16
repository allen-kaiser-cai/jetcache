package com.alicp.jetcache.support;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created on 2026/11/16.
 */
public class SumUtilsTest {

    @Test
    public void testSumPositiveNumbers() {
        assertEquals(5, SumUtils.sum(2, 3));
    }

    @Test
    public void testSumNegativeNumbers() {
        assertEquals(-5, SumUtils.sum(-2, -3));
    }
}