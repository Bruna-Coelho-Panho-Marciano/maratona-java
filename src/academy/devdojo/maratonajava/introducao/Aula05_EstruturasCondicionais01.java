package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !

        if (isAutorizadoComprarBebida != false) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        boolean c = false;
        if(c = true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");
    }
}
