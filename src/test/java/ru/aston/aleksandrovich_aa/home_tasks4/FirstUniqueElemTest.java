package ru.aston.aleksandrovich_aa.home_tasks4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstUniqueElemTest {

    @Test
    public void test() {

        int[] array = {6, 2, 5, 2, 6, 1, 5, 1, 7};
        int expected = 7;
        Assertions.assertEquals(expected, FirstUniqueElem.findFirstUniqueElem(array));
    }
}
