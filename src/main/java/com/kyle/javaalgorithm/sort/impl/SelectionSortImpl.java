package com.kyle.javaalgorithm.sort.impl;


import com.kyle.javaalgorithm.sort.Sort;

/**
 * 选择排序 时间复杂度 O(n^2),空间复杂度 O(1) 最好情况O(n^2) 最坏情况O(n^2)
 * @author kz37
 */
public class SelectionSortImpl implements Sort {

    public static void main(String[] args) {
        int[] source = {2, 1, 4, 3, 6, 5};
        source = new SelectionSortImpl().sort(source);
        for (int i : source) {
            System.out.println(i);
        }
    }


    @Override
    public int[] sort(int[] source) {
        int minIndex, temp;
        for (int i = 0; i < source.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < source.length; j++) {
                if (source[minIndex] > source[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
//                temp = source[minIndex];
//                source[minIndex] = source[i];
//                source[i] = temp;

                source[i] = source[i] ^ source[minIndex];
                source[minIndex] = source[i] ^ source[minIndex];
                source[i] = source[i] ^ source[minIndex];

//                source[i] = source[i] + source[minIndex];
//                source[minIndex] = source[i] - source[minIndex];
//                source[i] = source[i] - source[minIndex];
            }

        }
        return source;
    }
}
