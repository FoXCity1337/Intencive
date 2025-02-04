package ru.aston.aleksandrovich_aa.home_tasks3.long_word;

public class Main {
    public static void main(String[] args) {
        String str = "Учтите, что синтаксис лямбда-выражений может немного меняться: например, скобки вокруг единственного параметра не всегда необходимы.";
        System.out.println(LongWord.getLongWord(str));
    }

    static class LongWord {
        public static String getLongWord(String text) {
            String[] array = text.split("[ ,:.]");
            String string = "";
            for (String str : array) {
                if (str.length() > string.length()) {
                    string = str;
                }
            }
            return string;
        }
    }
}
