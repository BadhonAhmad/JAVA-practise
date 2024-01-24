class outer {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                //int y=10;
                void display() {
                    System.out.println("this is inner class=" + outer_x);
                }

            }
            Inner inner = new Inner();
            inner.display();
        }
        
    }

    // void showy() {
    // System.out.println("here is y="+y);//error y is unknown here
    // }

}

public class InnerClassDemo {
    public static void main(String[] args) {
        outer oter = new outer();
        oter.test();
    }
}
