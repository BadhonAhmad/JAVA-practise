package mypack.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0, c;
        try {
            divide(a, b);
            // throw new Exception("just for fun");
            // String name = "kunal";
            // if (name.equals("kunal")) {
            // throw new MyException("name is kunal");
            // }
            System.out.println("this will not be printed");
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("not getting");
        }
        // catch (MyException e) {
        // System.out.println(e.getMessage());
        // }
        catch (Exception e) {
            System.out.println("normal exception");
        }finally {
            System.out.println("this will always execute");
        }
        System.out.println("after catch and finally");
    }

    static int divide(int a, int b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("Please donot divide by zero");
        }
        return a / b;
    }
}
