package mypack;

class TwoD {
    int x, y;

    TwoD(int a, int b) {
        x = a;
        y = b;
    }
}

class ThreeD extends TwoD {
    int z;

    ThreeD(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}

class FourD extends ThreeD {
    int  t;
    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}

class Coords<T extends TwoD> {
    T[] ob;
    Coords(T[] o) {
        ob = o;
    }

    static void ShowXY(Coords<?> c) {
        for (int i = 0; i < c.ob.length; i++) {
            System.out.println(c.ob[i].x + " " + c.ob[i].y);
        }
    }

    static void ShowXYZ(Coords<? extends ThreeD> j) {
        for (int i = 0; i < j.ob.length; i++) {
            System.out.println(j.ob[i].x+" "+j.ob[i].y+" "+j.ob[i].z);
        }
    }
    
}
public class Gen1 {
    public static void main(String[] args) {
        // TwoD[] tk = { new TwoD(1, 2), new TwoD(2, 3), new TwoD(4, 5) };


        // Coords<TwoD> ct = new Coords<>(tk);

        // ct.ShowXY(ct);
        ThreeD[] ts = {  new ThreeD(1, 1, 1) ,  new ThreeD(10, 101, 10  )  };
        Coords<ThreeD> jk = new Coords<>(ts);
        jk.ShowXYZ(jk);
        
    }
}
// class TwoD {
//     int x, y;

//     TwoD(int a, int b) {
//         x = a;
//         y = b;
//     }
// }

// class ThreeD extends TwoD{
//     int z;

//     ThreeD(int a, int b, int c) {
//         super(a, b);
//         z = c;
//     }
// }

// class FourD extends ThreeD{
//     int t;

//     FourD(int a, int b, int c, int d) {
//         super(a, b, c);
//         t = d;
//     }
    
// }

// class Coords<T extends TwoD> {
//     T[] coords;

//     Coords(T[] nums) {
//         coords = nums;
//     }

//     static void ShowXY(Coords<?> o) {
//         System.out.println("X Y coordinates");
//         for (int i = 0; i < o.coords.length; i++) {
//             System.out.println(o.coords[i].x + " " + o.coords[i].y);
//         }
//         System.out.println();
//     }
//     static void ShowXYZ(Coords<? extends ThreeD> o) {
//         System.out.println("X Y Z coordinates");
//         for (int i = 0; i < o.coords.length; i++) {
//             System.out.println(o.coords[i].x + " " + o.coords[i].y+" "+o.coords[i].z);
//         }
//         System.out.println();
//     }
// }
// public class Gen1 {
//     public static void main(String[] args) {
//         TwoD[] two = { new TwoD(1, 3), new TwoD(6, 7) };
//         FourD[] four = { new FourD(1, 3,5,6), new FourD(6, 7,9,10) };
        
//         Double nums[] = { 1.1, 2.2, 3.2, 4.3, 5.3 };
//         Coords<FourD> dob = new Coords<>(four);
//         // Coords<TwoD> nam = new Coords<>(two);
//         // nam.ShowXY((nam));
//         dob.ShowXYZ(dob);
//     }
// }