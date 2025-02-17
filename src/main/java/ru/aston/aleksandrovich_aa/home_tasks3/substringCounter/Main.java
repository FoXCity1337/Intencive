package ru.aston.aleksandrovich_aa.home_tasks3.substringCounter;

public class Main {
    public static void main(String[] args) {
        String text = "привет, пока, как дела? привет, пока, привет";
        String substring = "привет";
        System.out.println(SubstringCounter.getCountOfSubstring(text, substring));
    }

    static class SubstringCounter {
        public static int getCountOfSubstring(String text, String substring) {
            int index = 0;
            int counter = 0;

            while ((index = text.indexOf(substring, index)) != -1) {
                counter++;
                index += substring.length();
            }
            return counter;
        }
    }
}
