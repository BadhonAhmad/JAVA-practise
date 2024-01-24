package mypack.Interfaces;

public class CdPlayer implements Media {
    public void start() {
        System.out.println("music start");
    }

    public void stop() {
        System.out.println("music stop");
    }
}
