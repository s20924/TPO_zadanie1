package com.company;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Futil {
    public static void processDir(String dirName, String resultFileName) throws IOException {
        Path path = Paths.get(dirName);
        Files.walkFileTree(path,new SimpleFileVisitor<Path>() {
            public FileVisitResult visitFIle(Path file, BasicFileAttributes a) throws IOException {
                System.out.println(Files.readAllLines(file));
            }
            return FileVisitResult.CONTINUE;
        });
    }
}
