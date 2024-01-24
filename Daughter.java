package mypack;

public class Daughter extends Parent {
    void career() {
        System.out.println("i want to be a doctor");
        System.out.println("age is" + age);
    }
    
    void normal(){
        super.normal();
    }

    void partner() {
        System.out.println("i love ,he is ");
        System.out.println("age is" + age);
    }
    
    Daughter(int age) {
        //this.age = age;
        super(age);
    }
}

