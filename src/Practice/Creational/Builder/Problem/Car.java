package Practice.Creational.Builder.Problem;

public class Car {
    private String engine;
    private String color;
    private Integer wheels;

    //Issues:
    //  Hard to manage when parameters increase.
    //  Parameters become hard to read if we don’t know their order or purpose.
    public Car(String engine, String color, Integer wheels) {
        this.engine = engine;
        this.color = color;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
