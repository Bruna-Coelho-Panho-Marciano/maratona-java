package academy.devdojo.maratonajava.introducao;

public class Aula07_ArraysParte02 {
    public static void main(String[] args) {
        // byte,short, int, long, float e double 0
        // char '\u0000' ' '
        //boolean false
        // String null

        String[] nomes = new String[4];
        nomes[0] = "Bruno";
        nomes[1] = "Bruna";
        nomes[2] = "Elis";
        nomes[3] = "Malu";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
