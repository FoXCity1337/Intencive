package ru.aston.aleksandrovich_aa.home_tasks1.task5;

import java.time.Year;

public class Home {
    private int floors;
    private int year;
    private String name;

    public void setter(int floors, int year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }

    public void getter() {
        System.out.println(this);
    }

    public int getAge() {
        return Year.now().getValue() - year;
    }

    @Override
    public String toString() {
        return "Home{" +
                "floors=" + floors +
                ", year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}
