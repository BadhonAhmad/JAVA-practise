class TestC {
    int a, b;
    TestC(int i, int j) {
        a = i;
        b = j;
    }
    void meth(TestC o) {
        o.a *= 2;
        o.b /= 2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        TestC ob = new TestC(15,20);
        System.out.println("before call" + ob.a + ob.b);
        ob.meth(ob);
        System.out.println("after call "+ob.a+ob.b);
    }
}
