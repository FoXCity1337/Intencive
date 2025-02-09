package ru.aston.aleksandrovich_aa.home_tasks4;

public class SortArray {

    public static String checkSortedArray(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (!(array[i] <= array[i + 1])){
                return "Please, try again";
            }
        }
        return "OK";
    }
}
