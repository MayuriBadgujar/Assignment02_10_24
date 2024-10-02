public class Car {
    private String type;
    private int horsepower;


    public Car(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public Car(Engine engine) {
    }

    public String getType() {
        return type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void displayEngineDetails() {
        System.out.println("Engine : " + type);
        System.out.println("Horsepower: " + horsepower + " HP");
    }

    public void start() {
    }

    public void stop() {
    }
}
