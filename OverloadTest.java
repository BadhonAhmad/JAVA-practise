public class OverloadTest {
    public static void main(String[] args) {
        Overload ob1 = new Overload();
        ob1.sum();
        ob1.sum(12, 12);
        ob1.sum(12.3, 2.3);
        int a = 3;
        ob1.sum(a);//this will automatic convert the int to double

    }
}
