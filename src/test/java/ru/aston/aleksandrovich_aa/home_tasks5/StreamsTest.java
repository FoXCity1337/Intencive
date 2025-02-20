package ru.aston.aleksandrovich_aa.home_tasks5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest {

    @Test
    @DisplayName("Вывести все четные числа в диапазоне от 1 до 100,")
    public void test1() {
        Streams.getMultiplesOf(2);
    }

    @Test
    @DisplayName("Умножить каждое число в массиве на 2")
    public void test2() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expectedArray = {2, 4, 6, 8, 10};

        Assertions.assertArrayEquals(expectedArray, Streams.multiple(array));
    }

    @Test
    @DisplayName("Посчитать сумму чисел в массиве [1, 2, 3, 4, 5], используя reduce()")
    public void test3() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Streams.getSumOfElements(array));
    }

    @Test
    @DisplayName("Вывести числа в диапазоне от 1 до 50 с шагом 2")
    public void test4() {
        Streams.getNumWithStep(2);
    }

    @Test
    @DisplayName("Найти первый четный элемент в списке [1, 2, 3, 4, 5]")
    public void test5() {
        int[] array = {1, 2, 3, 4, 5};
        int expected = 2;
        Assertions.assertEquals(expected, Streams.findFirstEvenElem(array));
    }

    @Test
    @DisplayName("Отсортировать элементы массива [3, 1, 5, 9, 7] по возрастанию")
    public void test6() {
        int[] array = {3, 1, 5, 9, 7};
        int[] expectedArray = {1, 3, 5, 7, 9};
        Assertions.assertArrayEquals(expectedArray, Streams.sortArray(array));
    }

    @Test
    @DisplayName("Вывести первые 10 чисел в списке [0, 1, 2, … 99]")
    public void test7() {
        List<Integer> list = IntStream
                .range(0, 101)
                .boxed()
                .toList();
        Streams.getFirstTenElem(list);
    }

    @Test
    @DisplayName("Пропустить первые 10 элементов списка [0, 1, 2,.., 99] и начать выводить с 11-го элемента, " +
            "выводя каждый 10-й элемент")
    public void test8() {
        List<Integer> list = IntStream
                .range(0, 101)
                .boxed()
                .toList();
        Streams.skipFirstTenElem(list);


    }

    @Test
    @DisplayName("Выведите на экран все числа в диапазоне от 1 до 100, которые делятся на 3.")
    public void test9() {
        Streams.getMultiplesOf(3);
    }

    @Test
    @DisplayName("Выведите все нечетные числа в заданном массиве.")
    public void test10() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Streams.getOddNum(array);
    }

    @Test
    @DisplayName("Выведите на экран только те элементы списка, которые больше заданного числа.")
    public void test11() {
        List<Integer> list = IntStream
                .range(1, 15)
                .boxed()
                .toList();
        Streams.getNumGreaterThan(list, 8);
    }

    @Test
    @DisplayName("Отфильтруйте все элементы списка, которые меньше 0.")
    public void test12() {
        List<Integer> list = new ArrayList<>();
        list.add(-12);
        list.add(-2);
        list.add(10);
        list.add(-10);
        list.add(7);
        list.add(17);
        Streams.filterNegativeNumbers(list);
    }

    @Test
    @DisplayName("Выведите на экран строки, которые начинаются с заданной подстроки.")
    public void test13() {
        List<String> list = new ArrayList<>();
        list.add("Привет");
        list.add("Олег");
        list.add("Практика");
        list.add("Полка");
        list.add("Прививка");
        Streams.subStringFilter(list, "П");
    }

    @Test
    @DisplayName("Выведите все числа в списке, которые не кратны 2.")
    public void test14() {
        List<Integer> list = IntStream
                .range(1, 20)
                .boxed()
                .toList();
        list.stream().filter(i -> i % 2 != 0)
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Отфильтруйте объекты по определенному свойству, например, выведите все записи из базы данных, " +
            "у которых значение поля равно 1.")
    public void test15() {
        Data.getUsersList().stream()
                .filter(i -> i.getAge() > 25)
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Выведите только те элементы коллекции, которые удовлетворяют определенному условию, например, " +
            "являются уникальными или имеют определенный формат.")
    public void test16() {
        Data.getUsersList().stream()
                .filter(i -> i.getLastname().length() == 7)
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Выведите на экран элементы списка, которые не входят в другой список.")
    public void test18() {
        Data.getUsersList().stream()
                .filter(i -> !Data.getManagersList().contains(i))
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Проверить, все ли числа в массиве [0, 1, …, 19] являются четными,")
    public void test19() {
        int[] array = IntStream
                .range(0, 20)
                .toArray();

        System.out.println(Arrays.stream(array)
                .allMatch(i -> i % 2 == 0));
    }

    @Test
    @DisplayName("Проверить, есть ли четное число в списке [0, 1, 2, 3]")
    public void test20() {
        List<Integer> list = IntStream
                .range(0, 4)
                .boxed()
                .toList();
        System.out.println(list
                .stream()
                .anyMatch(i -> i % 2 == 0));
    }

    @Test
    @DisplayName("Собрать все уникальные элементы Stream в список и отсортировать их.")
    public void test21() {
        List<String> list = List.of(
                "apple",
                "orange",
                "apple",
                "carrot",
                "pineapple"
        );
        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Собрать элементы Stream в карту, где ключом будет первая буква каждого слова, а значением — " +
            "само слово. Отсортировать ключи в алфавитном порядке.")
    public void test22() {
        Stream<String> stream = Stream.of(
                "Bruce",
                "Anna",
                "Johan",
                "Barry",
                "Dutch"
        );

        Map<Character, String> map = stream.collect(
                Collectors.toMap(i -> i.charAt(0), i -> i, (e, r) -> e + ", " + r));
        map.keySet()
                .stream()
                .sorted()
                .forEach(key -> System.out.println(key + ": " + map.get(key)));
    }

    @Test
    @DisplayName("Собрать числа в Stream в список сумм цифр каждого числа.")
    public void test23() {
        Stream<Integer> stream = Stream.of(
                12,
                115,
                1111);
        List<Integer> list = stream
                .map(i -> {
                    int sum = 0;
                    for (int j = i; j != 0; j /= 10) {
                        sum += (j % 10);
                    }
                    return sum;
                }).toList();
        System.out.println(list);
    }

    @Test
    @DisplayName("Собрать пользователей в Stream в список объектов, где каждый объект содержит информацию о городе" +
            " проживания пользователя и количестве пользователей из этого города.")
    public void test26() {
        Stream<User> usersStream = Stream.of(
                new User(1, "Арсений", "Александрович", 24, CitiesNames.BREST),
                new User(2, "Степан", "Малышев", 22, CitiesNames.GOMEL),
                new User(3, "Владислав", "Сeмёнов", 25, CitiesNames.BREST),
                new User(4, "Вероника", "Вихрова", 33, CitiesNames.MINSK),
                new User(5, "Анастасия", "Козлова", 22, CitiesNames.MOGILEV),
                new User(6, "Артем", "Нелепый", 18, CitiesNames.MOGILEV),
                new User(7, "Виталий", "Серый", 28, CitiesNames.GRODNO),
                new User(8, "Нина", "Кузнецова", 45, CitiesNames.VITEBSK)
        );

        List<Cities> cities = usersStream
                .collect(Collectors.groupingBy(User::getCity, Collectors.counting()))
                .entrySet()
                .stream()
                .map( i -> new Cities(i.getKey(),i.getValue()))
                .toList();

        usersStream.forEach(System.out::println);
    }
}
