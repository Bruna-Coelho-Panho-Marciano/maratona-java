package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZGpadroesdeprojeto.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZGpadroesdeprojeto.dominio.Country;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZGpadroesdeprojeto.dominio.Currency;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZGpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTeste01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
