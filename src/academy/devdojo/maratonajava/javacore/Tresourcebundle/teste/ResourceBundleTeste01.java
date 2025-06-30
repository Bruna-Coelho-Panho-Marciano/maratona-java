package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Tresourcebundle.teste;

import java.util.Locale;
import java.util.ResourceBundle;


public class ResourceBundleTeste01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en","US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

    }
}