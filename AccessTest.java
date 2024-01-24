class Access {
    private int c;
    void setc(int i) {
        c = i;
    }
    static int k=10;
    int getc() {
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Access ob = new Access();
        ob.setc(10);
        
        System.out.println("k" + Access.k);
        
        System.out.println("c =" + ob.getc());
    }
}
