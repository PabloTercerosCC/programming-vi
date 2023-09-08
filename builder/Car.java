public class Car {
    private String carType;
    private Double basePrice;
    private Location procedence;

    private Car() {
        
    }

    public String getCarType() {
        return carType;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public Location getProcedence() {
        return procedence;
    }

    public static class Builder {
        private String carType;
        private Double basePrice;
        private Location procedence;

        public Builder() {
            
        }

        public Builder setCarType(String carType) {
            this.carType = carType;
            return this;
        }

        public Builder setBasePrice(Double basePrice) {
            this.basePrice = basePrice;
            return this;
        }

        public Builder setProcedence(Location procedence) {
            this.procedence = procedence;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.carType = this.carType;
            car.basePrice = this.basePrice;
            car.procedence = this.procedence;
            return car;
        }
    }

    public enum Location {
        USA,
        JAPAN
    }

    public static void main(String[] args) {
        Car car = new Car.Builder()
        .setCarType("Sedan")
        .setBasePrice(25000.0)
        .setProcedence(Location.USA)
        .build();

        System.out.println(car.getCarType() + " " + car.getProcedence() + " " + car.getBasePrice());
    }
}
