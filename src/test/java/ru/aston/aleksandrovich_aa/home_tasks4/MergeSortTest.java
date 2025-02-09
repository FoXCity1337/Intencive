package ru.aston.aleksandrovich_aa.home_tasks4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortTest {

    @Test
    public void test() {

        int[] actualArray = {2, 4, 1, 5, 8, 0};
        int[] expectedArray = {0, 1, 2, 4, 5, 8};
        MergeSort.mergeSort(actualArray);
        Assertions.assertArrayEquals(expectedArray, actualArray);
    }
}
