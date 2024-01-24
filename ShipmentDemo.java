public class ShipmentDemo {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 10, 10, 20, 40);
        Shipment shipment2 = new Shipment(1, 2, 3, 12, 1.28);
        double vol;
        Box b = new Box();
        BoxWeight bw = new BoxWeight();//jake inherit kora hoy sha super class

        //shipment1 = b;
        b = shipment1;
        bw = shipment1;
        //shipment1 = bw;
        System.out.println(b);
        vol = shipment1.volume();
        System.out.println("Volume of shipment1=" + vol);
        System.out.println("Weight of shipment1=" + shipment1.weight);
        System.out.println("cost of shipment1=" + shipment1.cost);
        vol = shipment2.volume();
        System.out.println("Volume of shipment2=" + vol);
        System.out.println("Weight of shipment2=" + shipment2.weight);
        System.out.println("cost of shipment2=" + shipment2.cost);

    }
}
