class BoxWeight extends Box{
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double w, double h, double d, double wt) {
        super(w, h, d);
        weight = wt;
    }

    BoxWeight(double len, double wt) {
        super(len);
        weight = wt;
    }
}
