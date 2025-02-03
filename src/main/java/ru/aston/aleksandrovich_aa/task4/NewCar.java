package ru.aston.aleksandrovich_aa.task4;

public class NewCar {
    private String color;
    private String name;
    private double weight;

    public NewCar(String color) {
        this.color = color;
    }

    public NewCar(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public NewCar() {
    }

    public void printInfo() {
        System.out.println("Color: " + color + "\n" +
                "name: " + name + "\n" +
                "weight: " + weight);
    }
}
