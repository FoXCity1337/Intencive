package ru.aston.aleksandrovich_aa.task5;

public class Main {
    public static void main(String[] args) {
        Home home = new Home();
        Home home2 = new Home();

        home.setter(5, 2001, "Мир");
        home2.setter(12, 1990, "Ястреб");

        home.getter();
        home2.getter();

        System.out.println(home.getAge());
        System.out.println(home2.getAge());
    }
}
