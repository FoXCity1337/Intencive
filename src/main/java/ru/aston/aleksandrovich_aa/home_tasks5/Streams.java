package ru.aston.aleksandrovich_aa.home_tasks5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Streams {

    public static void getMultiplesOf(int num) {
        IntStream.range(1, 100)
                .filter(i -> i % num == 0)
                .forEach(System.out::println);
    }

    public static int[] multiple(int[] array) {
        return Arrays.stream(array)
                .map(i -> i * 2)
                .toArray();
    }

    public static int getSumOfElements(int[] array) {
        return Arrays.stream(array)
                .reduce(Integer::sum)
                .getAsInt();
    }

    public static void getNumWithStep(int step) {
        IntStream.range(1, 50)
                .filter(i -> i % step != 0)
                .forEach(System.out::println);
    }

    public static int findFirstEvenElem(int[] array) {
        return Arrays.stream(array)
                .filter(i -> i % 2 == 0)
                .findFirst()
                .getAsInt();
    }

    public static int[] sortArray(int[] array) {
        return Arrays.stream(array)
                .sorted()
                .toArray();
    }

    public static void getFirstTenElem(List<Integer> list) {
        list.stream()
                .limit(10)
                .forEach(System.out::println);
    }

    public static void skipFirstTenElem(List<Integer> list) {
        list.stream()
                .skip(10)
                .filter(i -> i % 10 == 0)
                .forEach(System.out::println);
    }

    public static void getOddNum(int[] array) {
        Arrays.stream(array)
                .filter(i -> i % 2 != 0)
                .forEach(System.out::println);
    }

    public static void getNumGreaterThan(List<Integer> list, int num) {
        list.stream()
                .filter(i -> i > num)
                .forEach(System.out::println);
    }

    public static void filterNegativeNumbers(List<Integer> list) {
        list.stream()
                .filter(i -> i < 0)
                .sorted()
                .forEach(System.out::println);
    }

    public static void subStringFilter(List<String> list, String subString) {
        list.stream()
                .filter(i -> i.startsWith(subString))
                .forEach(System.out::println);
    }
}
