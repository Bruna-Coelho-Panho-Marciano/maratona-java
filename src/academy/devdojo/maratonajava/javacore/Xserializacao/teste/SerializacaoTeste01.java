package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Xserializacao.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Xserializacao.Aluno;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTeste01 {
    public static void main(String[] args) {
//       Aluno aluno = new Aluno(1L,"Bruna","123412121");
//       serializar(aluno
        deserializar();
    }

    public static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno =(Aluno) ois.readObject();
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

