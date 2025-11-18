package edu.io;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        var dirName = ".";

        try (Stream<Path> paths = Files.walk(Paths.get(dirName))) {
            paths.filter(Files::isDirectory)
                    .forEach(System.out::println);
        }
    }
}
