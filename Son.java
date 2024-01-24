package mypack;

public class Son extends Parent{
    void career() {
        System.out.println("i want to be a engineer");
        System.out.println("age is"+age);
    }

    void partner() {
        System.out.println("i love  someone");
        System.out.println("age is"+age);
    }

    Son(int age) {
        //this.age = age;
        super(age);
    }
}
