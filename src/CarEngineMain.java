public class CarEngineMain {
    public static void main(String args[]) {
        Engine engine = new Engine("V8", 450);

        // Create a car with the engine
        Car car;
        car = new Car(engine);

        // Display engine details
        car.displayEngineDetails();

        // Start the car
        car.start();

        // Stop the car
        car.stop();
    }
}