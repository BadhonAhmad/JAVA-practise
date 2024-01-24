class TypeInterferenc {
    static MyClass getObj(int which){
        switch(which){
            case 0:
                return new MyClass();
            case 1:
                return new FirstDerived();
            default:
                return new SecondDerived();
        }
    }
    public static void main(String[] args) {
        var mc = getObj(0);
        var mc2 = getObj(1);
        var mc3 = getObj(2);
    }
}