package ru.aston.aleksandrovich_aa.home_tasks6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileMethods {

    public static List<String> readFile(Path filePath) throws IOException {
        return Files.readAllLines(filePath);
    }

    public static void writeFile(Path path, String text) throws IOException {
        byte[] array = text.getBytes();
        Files.write(path, array);
    }

    public static void mergeFiles(Path file1, Path file2, Path fileOutput) throws IOException {
        List<String> output = new ArrayList<>();
        output.addAll(readFile(file1));
        output.addAll(readFile(file2));

        String text = output.stream().collect(Collectors.joining("\n"));
        writeFile(fileOutput, text);
    }

    public static void replaceSigns(Path file) throws IOException {
        List<String> list = readFile(file);

        String s = list.stream()
                .map(i -> i.replaceAll("[ .,^:?!-]", "\\$"))
                .collect(Collectors.joining("\n"));
        writeFile(file, s);
    }
}
