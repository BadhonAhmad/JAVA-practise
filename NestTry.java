package mypack.ExceptionHandling;

public class NestTry {
    static void NestTry(int a) {
        try{
            if(a == 1) a=a/(a-a);
            if(a == 2){
                int []c={1};
                c[43]=43;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        // int a=args.length;
        // System.out.println("a ="+a);
        try{
            // try{
            //     if(a == 1)  a=a/(a-a);
            //     if(a == 2) {
            //         int ar[]={1};
            //         ar[44]=43;
            //     }
            int a=args.length;
            System.out.println("a ="+a);
            NestTry(a);
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
        // }
        // catch (ArithmeticException e) {
        //     System.out.println(e);
        // }
        System.out.println("after try and catch blocks");
    }
}
