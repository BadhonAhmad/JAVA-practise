interface AA {
    void m();
    
    default public void meth() {
        System.out.println("i am default");
    }

    
}
