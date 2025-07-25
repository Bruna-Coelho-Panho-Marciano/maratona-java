package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Wnio.teste;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile( Path file, BasicFileAttributes attrs) {
        if (file.getFileName().toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTeste01  {
    public static void main(String[] args) throws IOException{
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
