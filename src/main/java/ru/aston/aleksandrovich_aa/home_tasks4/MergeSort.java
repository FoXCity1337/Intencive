package ru.aston.aleksandrovich_aa.home_tasks4;

public class MergeSort {
    public static void mergeSort(int[] array) {

        if (array.length == 1) {
            return;
        }

        int[] leftPart = new int[array.length / 2];
        int[] rightPart = new int[array.length - leftPart.length];

        for (int i = 0; i < leftPart.length; i++) {
            leftPart[i] = array[i];
        }

        for (int i = 0; i < rightPart.length; i++) {
            rightPart[i] = array[leftPart.length + i];
        }
        mergeSort(leftPart);
        mergeSort(rightPart);
        merge(array, leftPart, rightPart);
    }

    private static void merge(int[] array, int[] leftPart, int[] rightPart) {

        int leftPartLength = leftPart.length;
        int rightPartLength = rightPart.length;
        int leftCounter = 0;
        int rightCounter = 0;
        int arrayCounter = 0;

        while (leftCounter < leftPartLength && rightCounter < rightPartLength) {
            if (leftPart[leftCounter] < rightPart[rightCounter]) {
                array[arrayCounter] = leftPart[leftCounter];
                leftCounter++;
            } else {
                array[arrayCounter] = rightPart[rightCounter];
                rightCounter++;
            }
            arrayCounter++;
        }

        for (int i = leftCounter; i < leftPartLength; i++) {
            array[arrayCounter++] = leftPart[i];
        }

        for (int i = rightCounter; i < rightPartLength; i++) {
            array[arrayCounter++] = rightPart[i];
        }
    }
}