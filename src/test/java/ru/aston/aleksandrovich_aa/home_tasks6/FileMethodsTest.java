package ru.aston.aleksandrovich_aa.home_tasks6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMethodsTest {
    private Path path1 = Path.of("d:\\text1.txt");
    private Path path2 = Path.of("d:\\text2.txt");
    private Path path3 = Path.of("d:\\text3.txt");
    private String text1 = "Я помню чудное мгновенье:\n" +
            "Передо мной явилась ты,\n";
    private String text2 = "Как мимолетное виденье,\n" +
            "Как гений чистой красоты. ";

    @BeforeEach
    public void setUp() throws IOException {
        if (!Files.exists(path1)) {
            Files.createFile(path1);
        }
        if (!Files.exists(path2)) {
            Files.createFile(path2);
        }
        if (!Files.exists(path3)) {
            Files.createFile(path3);
        }
    }

    @Test
    @DisplayName("Написать метод, который читает текстовый файл и возвращает его в виде списка строк.")
    public void test1() throws IOException {
        FileMethods.readFile(path1);
    }

    @Test
    @DisplayName("Написать метод, который записывает в файл строку, переданную параметром.")
    public void test2() throws IOException {
        FileMethods.writeFile(path1, text1);
    }

    @Test
    @DisplayName("Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.")
    public void test3() throws IOException {
        FileMethods.mergeFiles(path1, path2, path3);
    }

    @Test
    @DisplayName("Написать метод который заменяет в файле все кроме букв и цифр на знак ‘$’ ")
    public void test4() throws IOException {
        FileMethods.replaceSigns(path3);
    }
}
