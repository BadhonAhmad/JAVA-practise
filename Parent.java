package mypack;

abstract class Parent {
    // abstract Parent();
    /*
     * abstract constructors are not allowed
     * 
     */

    final int VALUE;
    void normal() {
        System.out.println("this is normal method");
    }

    public Parent(int age) {
        this.age = age;
        VALUE = 23234;
    }

    static void Hello() {
        System.out.println("hey");
    }

    abstract void career();

    abstract void partner();

    static int age;

}