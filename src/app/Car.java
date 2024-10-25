package app;

public class Car {

    public void start() {

        startElectricity();
        startCommand();
        startFuelSystem();

    }

    private void startElectricity() {
        System.out.println("turn on electricity");
    }

    private void startCommand() {
        System.out.println("checking the system for errors");
    }

    private void startFuelSystem() {
        System.out.println("supplying fuel to the system");
    }

}
