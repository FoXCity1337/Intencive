package ru.aston.aleksandrovich_aa.home_tasks4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArrayTest {

    @Test
    public void test() {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 5, 2, 3, 4};
        String expected1 = "OK";
        String expected2 = "Please, try again";

        Assertions.assertEquals(expected1, SortArray.checkSortedArray(array1));
        Assertions.assertEquals(expected2, SortArray.checkSortedArray(array2));
    }
}