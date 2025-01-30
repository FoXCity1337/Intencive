package ru.aston.aleksandrovich_aa.task2;

public class Car {
    private String color;
    private String model;
    private int yearOfIssue;

    public Car() {
    }

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public Car(String color, String model, int yearOfIssue) {
        this.color = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
    }
}
