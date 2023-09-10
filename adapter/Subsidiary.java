package adapter;

public class Subsidiary {

    public static void shipCar() {
        LandDep landShipping = new LandDep();
        ShippingDep adapter = new Adapter(landShipping);

        adapter.ship();
    }

    public static void main(String[] args) {
        shipCar();
    }
}
