package ru.aston.aleksandrovich_aa.home_tasks4;

public class Swapping {

    public static void swapFirstWithLast(int[] array) {

        int temp = array[array.length - 1];
        array[array.length - 1] = array[0];
        array[0] = temp;
    }
}
