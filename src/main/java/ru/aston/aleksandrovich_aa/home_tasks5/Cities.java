package ru.aston.aleksandrovich_aa.home_tasks5;

public class Cities {
    private Long population;
    private String name;

    public Cities(String name, Long population) {
        this.population = population;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "population=" + population +
                ", name='" + name + '\'' +
                '}';
    }
}