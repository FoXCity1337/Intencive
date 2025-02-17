package ru.aston.aleksandrovich_aa.home_tasks3.censor;

public class Main {
    public static void main(String[] args) {
        System.out.println(Censor.getCensor("Мама бяка папа бяка"));
    }

    static class Censor{
        public static String getCensor(String text){
            return text.replace("бяка","[вырезано цензурой]");
        }
    }
}
