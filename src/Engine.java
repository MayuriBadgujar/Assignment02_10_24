public class Engine {
    private Engine engine;
    private boolean isRunning;

    public Engine(Engine engine, boolean isRunning) {
        this.engine = engine;
        this.isRunning = isRunning;
    }

    public Engine(String v8, int i) {
    }


    public void start() {
        if (isRunning) {
            isRunning = true;
            System.out.println("Car started.");
        } else {
            System.out.println("Car is already running.");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Car stopped.");
        } else {
            System.out.println("Car is already stopped.");
        }
    }
    public void displayEngineDetails() {
        engine.displayEngineDetails();
    }
}