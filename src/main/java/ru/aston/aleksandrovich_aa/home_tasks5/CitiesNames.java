package ru.aston.aleksandrovich_aa.home_tasks5;

public enum CitiesNames {
    MINSK("Минск"),
    VITEBSK("Витебск"),
    GRODNO("Гродно"),
    MOGILEV("Могилев"),
    GOMEL("Гомель"),
    BREST("Брест");

    private String name;

    CitiesNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
