class Box {
    private double width;
    private double height;
    private double depth;

    class bi {
        Box bk=new Box();
  

    }
    // public void setDim(double w, double h, double d) {
    //     width=w;
    //     height = h;
    //     depth = d;
    // }
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;height=-1;depth=-1;
    }

    Box(double len) {
        width = height = depth = len;
    }
    double volume() {
        return width * height * depth;//System.out.println("volume="+vol);
    }
}