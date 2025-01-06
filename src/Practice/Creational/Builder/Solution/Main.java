package Practice.Creational.Builder.Solution;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                    .setEngine("v4").setColor("white").setWheels(4).build();
        System.out.println(car);
    }
}
