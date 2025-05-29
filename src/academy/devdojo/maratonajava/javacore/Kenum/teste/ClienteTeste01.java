package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Kenum.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;


public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Elis", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Luisa", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}


