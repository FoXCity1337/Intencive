package ru.aston.aleksandrovich_aa.home_tasks5;

import java.util.List;

public class Data {

    private static List<User> usersList = List.of(
            new User(1, "Арсений", "Александрович", 24, CitiesNames.BREST),
            new User(2, "Степан", "Малышев", 22, CitiesNames.GOMEL),
            new User(3, "Владислав", "Сeмёнов", 25, CitiesNames.BREST),
            new User(4, "Вероника", "Вихрова", 33, CitiesNames.MINSK),
            new User(5, "Анастасия", "Козлова", 22, CitiesNames.MOGILEV),
            new User(6, "Артем", "Нелепый", 18, CitiesNames.MOGILEV),
            new User(7, "Виталий", "Серый", 28, CitiesNames.GRODNO),
            new User(8, "Нина", "Кузнецова", 45, CitiesNames.VITEBSK)
    );

    private static List<User> managersList = List.of(
            usersList.getFirst(),
            usersList.get(3)
    );


    public static List<User> getUsersList() {
        return usersList;
    }

    public static List<User> getManagersList() {
        return managersList;
    }


}
