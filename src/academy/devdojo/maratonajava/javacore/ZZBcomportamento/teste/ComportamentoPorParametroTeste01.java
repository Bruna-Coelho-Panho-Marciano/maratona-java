package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZBcomportamento.teste;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("--------------");
        System.out.println(filterByYearBefore(cars, 2015));



    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> filterredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                filterredCar.add(car);
            }
        }
        return filterredCar;
    }

    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> filterredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")) {
                filterredCar.add(car);
            }
        }
        return filterredCar;
    }


    private static List<Car> filterCarByColor(List<Car> cars, String cor) {
        List<Car> filterredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)) {
                filterredCar.add(car);

            }
        }
        return filterredCar;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> filterredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filterredCar.add(car);

            }
        }
        return filterredCar;
    }
}


