package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZGpadroesdeprojeto.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZGpadroesdeprojeto.dominio.Person;

public class BuilderPatternTeste01 {
    public static void main(String[] args) {
          Person build = new Person.PersonBuilder()
                .firstName("William")
                .lastName("Suane")
                .username("Virado no Jiraya")
                .email("william.suane@devdojo.academy")
                  .build();
        System.out.println(build);


    }
}
