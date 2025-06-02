package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

import java.io.IOException;
import java.sql.SQLException;

public class RuntimeTeste04 {
    public static void main(String[] args) {
       try {
           throw new RuntimeException();
       } catch(ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | AritmeticException");
       } catch (RuntimeException e) {
           System.out.println("Dentro do RuntimeException");
       }
       try {
           talvezLanceException();
       } catch (IOException  | SQLException e) {

           e.printStackTrace();
       }
    }

    private static void talvezLanceException() throws SQLException, IOException {

    }
}
