package ru.aston.aleksandrovich_aa.home_tasks3.isPalindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println(Palindrome.definePalindrome("Алла"));
        System.out.println(Palindrome.definePalindrome("Максим"));
        System.out.println(Palindrome.definePalindrome("шалаш"));
    }

    static class Palindrome {
        public static boolean definePalindrome(String word) {
            word = word.toLowerCase();
            for (int i = 0; i < word.length() / 2; i++) {
                if (!(word.charAt(i) == word.charAt(word.length() - 1 - i))) {
                    return false;
                }
            }
            return true;
        }
    }
}
