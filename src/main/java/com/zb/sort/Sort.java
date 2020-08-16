package com.zb.sort;

/**
 *                                                ----- bubble sort
 *                            ----- exchange sort
 *                           |                    ----- quick sort
 *                           |
 *                           |                     ----- simple insertion sort
 *                           |----- insertion sort
 *                           |                     ----- shell sort
 *      ----- comparison sort
 *     |                     |                     ----- simple selection sort
 *     |                     |----- selection sort
 *     |                     |                     ----- heap sort
 *     |                     |
 *     |                     |                     ----- two-way merge sort
 * sort                       ----- merge sort
 *     |                                           ----- multiplexing merge sort
 *     |
 *     |                          ----- count sort
 *     |                         |
 *      ----- no comparison sort  ----- bucket sort
 *                               |
 *                                ----- radix sort
 */
public class Sort {
    private Sort() {}

    /**
     * bubble sort, time complexity: O(n2), space complexity: O(1)<br/>
     * <br/>
     * 冒泡排序，时间复杂度为：O(n2)，空间复杂度为：O(1)
     */
    public static int[] bubbleSort(int[] array) {
        if (array == null) {
            return null;
        }
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                // do swap
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return array;
    }

    /**
     * quick sort, time complexity: , space complexity: <br/>
     * <br/>
     */
    public static int[] quickSort(int[] array) {
        return array;
    }

    /**
     * insertion sort, time complexity: O(n2), space complexity: O(1)<br/>
     * <br/>
     * 插入排序，时间复杂度为：O(n2)，空间复杂度为：O(1)
     */
    public static int[] insertionSort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        int preIndex, current;
        for (int i = 1; i < array.length; i++) {
            preIndex = i - 1;
            current = array[i];
            while (preIndex >= 0 && array[preIndex] > current) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        return array;
    }

    /**
     * shell sort, time complexity: , space complexity: <br/>
     * <br/>
     */
    public static int[] shellSort(int[] array) {
        return array;
    }

    /**
     * selection sort, time complexity: O(n2), space complexity: O(1)<br/>
     * <br/>
     * 选择排序，时间复杂度为：O(n2)，空间复杂度为：O(1)
     */
    public static int[] selectionSort(int[] array) {
        if (array == null) {
            return null;
        }
        int minIndex;
        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
        return array;
    }
}
