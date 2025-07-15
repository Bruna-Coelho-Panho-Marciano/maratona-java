package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZAclassesinternas.teste;

public class OuterClassesTeste02 {

    private String name = "Bruno";

    void print(final String param){
        final String lastName = "Marie";
        name = "";
        class LocalClass{
            public void printLocal(){
                System.out.println(param);
                System.out.println(name + " "+lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTeste02 outer = new OuterClassesTeste02();
    }
}
