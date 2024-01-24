package mypack;

import javax.sound.sampled.SourceDataLine;

public class Outer {
    int num = 5;

    public void heyThere() {
        System.out.println("hey there");
        String loc = "badhon";
        class LocInner {
            void meth() {
                System.out.println(loc);
            }
        }
        LocInner li = new LocInner();
        li.meth();
    }

    public static class inner {
        public void whatsUpp() {
            System.out.println("inner class");
        }
    }
}
