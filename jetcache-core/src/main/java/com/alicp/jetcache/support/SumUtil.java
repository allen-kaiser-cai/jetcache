package com.alicp.jetcache.support;

/**
 * 数值求和工具类。
 *
 * @author jetcache
 */
public final class SumUtil {

    private SumUtil() {
    }

    /**
     * 对传入的 long 值求和。
     *
     * @param values 待求和的值，允许为 null 或空数组
     * @return 求和结果；values 为 null 或空数组时返回 0
     */
    public static long sum(long... values) {
        long total = 0L;
        if (values == null) {
            return total;
        }
        for (long value : values) {
            total += value;
        }
        return total;
    }
}