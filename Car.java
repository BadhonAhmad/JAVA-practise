package mypack.Interfaces;

public class Car implements Engine,Brake,Media{
    public void start() {
        System.out.println("i start like a normal car");
    }

    public void brake() {
        System.out.println("i stop like a normal car");
    }

    public void stop() {
        System.out.println("i stop like a normal car");
    }

    public void acc() {
        System.out.println("i accelerate like a normal car");
    }
}
