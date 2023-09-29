class Engine {
    void start() {
        System.out.println("Engine started.");
    }
}

class Car {
    private Engine engine;

    Car() {
        engine = new Engine();
    }

    void start() {
        System.out.println("Car started.");
        engine.start();
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
