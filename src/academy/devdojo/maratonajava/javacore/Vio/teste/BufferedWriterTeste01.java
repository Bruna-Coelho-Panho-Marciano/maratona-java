package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Vio.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file);
             BufferedWriter br = new BufferedWriter(fw)) {
            br.write("O DevDojo é o melhor curso ");
            br.newLine();
            br.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}



