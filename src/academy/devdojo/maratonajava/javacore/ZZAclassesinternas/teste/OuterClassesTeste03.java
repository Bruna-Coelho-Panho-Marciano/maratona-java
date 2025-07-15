package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZAclassesinternas.teste;

public class OuterClassesTeste03 {
    private String name = "Elis";
    static class Nested {
        private String lastName = "Marie";

        void print(){
            System.out.println(new OuterClassesTeste03().name+ " " + lastName);
        }
    }
    public static void main(String[] args) {
        OuterClassesTeste03.Nested nested = new OuterClassesTeste03.Nested();
        nested.print();

    }
}
