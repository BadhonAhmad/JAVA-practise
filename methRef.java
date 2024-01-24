package mypack;

interface StringFunc{String Func(String n);}

class MyStringOps {
    String strRev(String str) {
        String res = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--)
            res += str.charAt(i);
        return res;
    }
}
public class methRef {
    static String Strinop(StringFunc sf, String s) {
        return sf.Func(s);}
        public static void  main(String[] args) {
            String instr="lamd sdj fa";
            String out;
            MyStringOps strops=new MyStringOps();
            out=Strinop(strops::strRev, instr);
            System.out.println(out);
        }
    }

