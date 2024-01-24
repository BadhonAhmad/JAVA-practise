package mypack.Interfaces;

public class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Electric engine starts");
    }

    public void stop() {
        System.out.println("Electric engine stop");
    }

    public void acc() {
        System.out.println("Electric engine accelerate");
    }
}