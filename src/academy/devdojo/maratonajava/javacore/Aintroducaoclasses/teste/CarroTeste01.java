package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

//Crie uma classe carro com os seguintes atributos
//Nome Modelo Ano
//Em seguida,crie dois objetos e imprima seus valores

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fiesta";
        carro1.modelo = "CLX";
        carro1.ano = 1996;

        carro2.nome = "Fusca";
        carro2.modelo = "Sport";
        carro2.ano = 1969;

        carro1 = carro2;

        System.out.println("Carro 1 ");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2 ");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);


    }
}
