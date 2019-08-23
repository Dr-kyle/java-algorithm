package com.kyle.javaalgorithm.sort.impl;

import com.kyle.javaalgorithm.sort.Sort;

/**
 * 插入排序 时间复杂度 O(n^2),空间复杂度 O(1) 最好情况O(n) 最坏情况O(n^2)
 * @author kz37
 */
public class InsertionSortImpl implements Sort {

    public static void main(String[] args) {
        int[] source = {2, 1, 4, 3, 6, 5, 2, 2, 3, 3};
        source = new InsertionSortImpl().sort(source);
        for (int i : source) {
            System.out.println(i);
        }
    }
    @Override
    public int[] sort(int[] source) {
        int current;
        for (int i = 1; i < source.length; i++) {
            current = source[i];
            for (int j = i; j > 0; j--) {
                if (source[j - 1] > current) {
                    source[j] = source[j - 1];
                    source[j - 1] = current;
                } else {
                    source[j] = current;
                    break;
                }
            }
        }
        return source;
    }
}
