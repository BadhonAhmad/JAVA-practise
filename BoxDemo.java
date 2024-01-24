class BoxDemo {
    public static void main(String[] args){
        Box mybox = new Box();
        mybox.width = 10;
        mybox.height = 1;
        mybox.depth = 10;
        double vol = (mybox.depth * mybox.height * mybox.width);
        System.out.println("vol=" + vol);
        Box mybox2 = new Box();
        mybox2.setDim(5, 6, 10);
        System.out.println("vol=" + mybox2.volume());
    }
}
