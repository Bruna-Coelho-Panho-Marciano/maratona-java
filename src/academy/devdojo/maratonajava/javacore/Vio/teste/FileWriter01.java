package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader
public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("O DevDojo é o melhor curso\nContinuando a cantoria");
            fw.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}