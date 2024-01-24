package mypack.Interfaces;

public class PowerEngine implements Engine{
    public void start() {
        System.out.println("power engine start");
    }

    public void stop() {
        System.out.println("power engine stop");
    }

    public void acc() {
        System.out.println("power engine accelerate");
    }
}
