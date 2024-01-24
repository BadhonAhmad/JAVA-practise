public class Shipment extends  BoxWeight {
    double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }
    Shipment(double w, double h, double d, double wt, double c) {
        super(w, h, d, wt);
        cost = c;
    }
    
    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double wt, double c) {
        super(len, wt);
        cost = c;
    }
}
