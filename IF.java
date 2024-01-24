interface If {
    void meth();
}
interface b extends If{
    void meth2();

    void meth3();
}
class myclass implements b{
    public void meth(){
        System.out.println("This is meth");
    }
    public void meth2(){
        System.out.println("This is meth2");
    }
    public void meth3(){
        
        System.out.println("meth3");
    }
}
class IF{
    public static void main(String[] args) {
        myclass my=new myclass();
        my.meth();
        my.meth2();
    }
}