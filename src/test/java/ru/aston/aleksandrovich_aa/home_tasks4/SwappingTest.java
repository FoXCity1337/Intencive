package ru.aston.aleksandrovich_aa.home_tasks4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwappingTest {

    @Test
    public void test() {

        int[] actualArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {5, 2, 3, 4, 1};
        Swapping.swapFirstWithLast(actualArray);
        Assertions.assertArrayEquals(expectedArray, actualArray);
    }
}