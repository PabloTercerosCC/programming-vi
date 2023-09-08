import java.util.ArrayList;
import java.util.List;

public class ShippingDepartment {
    private List<String> airports;
    private List<String> docks;
    private List<String> railroads;
    private ShippingType shippingType;

    private ShippingDepartment() {
    }

    public List<String> getAirports() {
        return airports;
    }

    public List<String> getDocks() {
        return docks;
    }

    public List<String> getRailroads() {
        return railroads;
    }

    public ShippingType getShippingType() {
        return shippingType;
    }

    public static class Builder {
        private List<String> airports = new ArrayList<>();
        private List<String> docks = new ArrayList<>();
        private List<String> railroads = new ArrayList<>();
        private ShippingType shippingType;

        public Builder() {
        }

        public Builder addAirport(String airport) {
            airports.add(airport);
            return this;
        }

        public Builder addDock(String dock) {
            docks.add(dock);
            return this;
        }

        public Builder addRailroad(String railroad) {
            railroads.add(railroad);
            return this;
        }

        public Builder setShippingType(ShippingType shippingType) {
            this.shippingType = shippingType;
            return this;
        }

        public ShippingDepartment build() {
            ShippingDepartment department = new ShippingDepartment();
            department.airports = this.airports;
            department.docks = this.docks;
            department.railroads = this.railroads;
            department.shippingType = this.shippingType;
            return department;
        }
    }

    public enum ShippingType {
        AIR,
        LAND,
        SEA
    }

    public static void main(String[] args) {
        ShippingDepartment department = new ShippingDepartment.Builder()
        .addAirport("Airport 1")
        .addDock("Dock 1")
        .setShippingType(ShippingType.AIR)
        .build();

        System.out.println(department.getAirports() + " " + department.getDocks() + " " + department.getRailroads() + " " + department.getShippingType());
    }
}
