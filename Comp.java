package mypack;
class comMeth {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i]))
                return true;
        }
        return false;
    }
}

public class Comp {
    public static void main(String[] args) {
        Integer nums[] = { 1, 2, 3, 4, 5, 6 };
        
        if (comMeth.isIn(2, nums)) {
            System.out.println("yes");
        }
    }
}
