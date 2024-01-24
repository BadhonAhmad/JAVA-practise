package mypack;

interface mnm<T extends Comparable<T>> {
    T min();

    T max();
}

class mycl<T extends Comparable<T>> implements mnm<T> {
    T[] vals;
    mycl(T[] o) {
        vals = o;
    }

    

    public T min() {T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0)
                v = vals[i];
        }
        return v;
    }

    public T max() {T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0)
                v = vals[i];
        }
        return v;
    }
}

public class MnM {
    public static void main(String[] args) {
        Double[] vk = { 1.2, 34.34, 343.234, 34.234 };
        mycl<Double> dk = new mycl<>(vk);
        System.out.println(dk.min());
        System.out.println(dk.max());
    }
    
}
