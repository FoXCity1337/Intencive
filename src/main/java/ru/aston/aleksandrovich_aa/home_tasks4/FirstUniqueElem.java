package ru.aston.aleksandrovich_aa.home_tasks4;

public class FirstUniqueElem {

    public static int findFirstUniqueElem(int[] array) {

        MergeSort.mergeSort(array);
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (array[i] != (array[i + 1])) {
                    return array[i];
                }
                continue;
            }

            if (i == array.length - 1) {
                if (array[i] != array[i - 1]) {
                    return array[i];
                }
                continue;
            }

            if (array[i] != array[i - 1] && array[i] != array[i + 1]) {
                return array[i];
            }
        }
        return 0;
    }
}