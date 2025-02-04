package ru.aston.aleksandrovich_aa.home_tasks3.reverse;

public class Main {
    public static void main(String[] args) {
        System.out.println(Reverse.getReverseText("This is a test string"));
    }

    static class Reverse {
        public static String getReverseText(String text) {
            String[] array = text.split(" ");
            StringBuilder reverseWord = new StringBuilder();
            StringBuilder reverseText = new StringBuilder();
            for (String s : array) {
                for (int j = s.length() - 1; j >= 0; j--) {
                    reverseWord.append(s.charAt(j));
                }
                reverseText.append(reverseWord).append(" ");
                reverseWord = new StringBuilder();
            }
            return reverseText.toString();
        }
    }
}
