package com.kyle.javaalgorithm.sort.impl;

import com.kyle.javaalgorithm.sort.Sort;

/**
 * 冒泡排序
 * 时间复杂度 O(n^2),空间复杂度 O(1) 最好情况O(n) 最坏情况O(n^2)
 * @author kz37
 */
public class BubbleSortImpl implements Sort {
    public static void main(String[] args) {
        int[] source = {2, 1, 4, 3, 6, 5};
        source = new BubbleSortImpl().sort(source);
        for (int i : source) {
            System.out.println(i);
        }
    }

    /**
     * 冒泡排序
     * @param source
     * @return
     */
    @Override
    public int[] sort(int[] source) {
        int temp;
        for (int i = 0; i < source.length - 1; i++) {
            for (int j = 0; j < source.length - 1 - i; j++) {
                if (source[j] > source[j + 1]) {
                    // 这一块可以有好几种交换方式
                    temp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = temp;
                }
            }
        }
        return source;
    }

    /**
     * 中间值交换
     * @param left first para
     * @param right second para
     */
    public static void exchangeValue(int left, int right) {
        int temp = left;
        left = right;
        right = temp;
    }

    /**
     * 位移运算交换
     * & 按位与 如果相对应位都是1，则结果为1，否则为0
     * | 按位或 如果相对应位都是0，则结果为0，否则为1
     * ^ 异或 如果相对应位值相同，则结果为0，否则为1 如果 a ^ b = c, 则 b = a ^ c, 或 a = b ^ c, 两个相同的数异或结果为0
     * ~ 按位取反运算符翻转操作数的每一位，即0变成1，1变成0
     * @param left first para
     * @param right second para
     */
    public static void exchangeValue1(int left, int right) {
        left = left ^ right;
        right = left ^ right;
        left = left ^ right;
    }

    /**
     * 加减法交换
     * @param left first para
     * @param right second para
     */
    public static void exchangeValue2(int left, int right) {
        left = left + right;
        right = left - right;
        left = left - right;
    }
}
