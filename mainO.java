package mypack;

public class mainO {
    public static void main(String[] args) {
        Outer ou = new Outer();
        ou.heyThere();
        Outer.inner inn = new Outer.inner();
        inn.whatsUpp();
    }
}
