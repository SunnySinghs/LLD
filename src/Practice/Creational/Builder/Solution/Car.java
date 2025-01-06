package Practice.Creational.Builder.Solution;

public class Car {
    private String engine;
    private String color;
    private Integer wheels;

    private Car(Builder builder) {
        engine = builder.engine;
        color = builder.color;
        wheels = builder.wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    public static class Builder {
        private String engine;
        private String color;
        private Integer wheels;

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setWheels(Integer wheels) {
            this.wheels = wheels;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
