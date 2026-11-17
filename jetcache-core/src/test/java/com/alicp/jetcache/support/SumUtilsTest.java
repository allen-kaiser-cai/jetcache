package com.alicp.jetcache.support;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumUtilsTest {

    @Test
    public void testSumPositive() {
        Assertions.assertEquals(5, SumUtils.sum(2, 3));
    }

    @Test
    public void testSumNegative() {
        Assertions.assertEquals(-5, SumUtils.sum(-2, -3));
    }
}