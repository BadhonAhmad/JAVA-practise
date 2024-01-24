public class Overload {
    void sum(int a, int b) {
        System.out.println("int int="+a+b);
    }

    void sum(double a, double b) {
        System.out.println(" double double =" + a + b);
    }

    int sum(double a) {
        System.out.println("int =" + a + 8);
        return 0;
    }
    //the below method is invalid because the method return type is alone not enough to distinguish two methods
    // double sum(double a) {
    //     System.out.println("sum=" + a + 4);
    //     return 0;
    // }
    void sum() {
        System.out.println("no parameters");
    }
}

