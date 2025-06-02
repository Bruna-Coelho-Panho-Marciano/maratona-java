package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "Bruno"; // String constant pool
        String nome2 = "Bruno";
        nome = nome.concat(" Marciano");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Bruno"); // 1 variavel de referencia, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3.intern());
    }
}
