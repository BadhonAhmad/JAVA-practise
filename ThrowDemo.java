package mypack.ExceptionHandling;

public class ThrowDemo {
    public static void demopro() {
        try{
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e) {
            System.out.println("hello,inside demoopro");
            throw e;//rethraw error
        }
    }
    public static void main(String[] args) {
        try{
            demopro();
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
