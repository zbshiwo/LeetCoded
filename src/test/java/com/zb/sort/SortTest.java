package com.zb.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortTest {
    private static int[] array;
    private static int[] expected;

    @BeforeEach
    void setUp() {
        array = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        expected = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    @Test
    void testBubbleSort() {
        assertArrayEquals(expected, Sort.bubbleSort(array));
    }

    @Test
    void testInsertionSort() {
        assertArrayEquals(expected, Sort.insertionSort(array));
    }

    @Test
    void testSelectionSort() {
        assertArrayEquals(expected, Sort.selectionSort(array));
    }
}
