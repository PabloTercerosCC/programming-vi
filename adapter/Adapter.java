package adapter;

public class Adapter implements ShippingDep {

    private LandDep landDep;

    public Adapter(LandDep landDep) {
        this.landDep = landDep;
    }

    @Override
    public void ship() {
        landDep.shipByLand();
    }

}
