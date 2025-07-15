package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZAclassesinternas.teste;

public class OuterClassesTeste01 {
    private String name = "Elis";

    class Inner {
        public void printOuterClassAtribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTeste01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTeste01 outerClass = new OuterClassesTeste01();
        Inner inner =outerClass.new Inner();
        Inner inner2 = new OuterClassesTeste01().new Inner();
        inner.printOuterClassAtribute();
        inner2.printOuterClassAtribute();

    }
}
