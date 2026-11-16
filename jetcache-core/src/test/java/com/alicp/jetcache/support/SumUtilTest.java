package com.alicp.jetcache.support;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * {@link SumUtil} 的单元测试。
 *
 * @author jetcache
 */
public class SumUtilTest {

    @Test
    public void testSumPositiveValues() {
        assertEquals(6L, SumUtil.sum(1, 2, 3));
    }

    @Test
    public void testSumWithNegativeAndZero() {
        assertEquals(-2L, SumUtil.sum(-5, 5, 0, -2));
    }

    @Test
    public void testSumSingleValue() {
        assertEquals(7L, SumUtil.sum(7));
    }

    @Test
    public void testSumNoArguments() {
        assertEquals(0L, SumUtil.sum());
    }

    @Test
    public void testSumNullArray() {
        assertEquals(0L, SumUtil.sum((long[]) null));
    }

    @Test
    public void testSumEmptyArray() {
        assertEquals(0L, SumUtil.sum(new long[0]));
    }

    @Test
    public void testSumBeyondIntRange() {
        assertEquals(4294967294L, SumUtil.sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void testSumDoesNotModifyInput() {
        long[] values = {1L, -2L, 3L};
        long[] copy = values.clone();

        assertEquals(2L, SumUtil.sum(values));
        assertArrayEquals(copy, values);
    }
}