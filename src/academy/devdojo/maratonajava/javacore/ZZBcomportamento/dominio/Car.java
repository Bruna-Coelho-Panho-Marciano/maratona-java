package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio;

public class Car {
    private String name = "Fiesta";
    private String color;
    private int year;

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
