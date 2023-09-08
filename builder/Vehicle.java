class Vehicle {
    private String make;
    private String model;
    private int year;
    private int price;

    protected Vehicle(VehicleBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.price = builder.price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year + ", Price: $" + price;
    }

    public static abstract class VehicleBuilder<T extends VehicleBuilder<T>> {
        private String make;
        private String model;
        private int year;
        private int price;

        public T setMake(String make) {
            this.make = make;
            return self();
        }

        public T setModel(String model) {
            this.model = model;
            return self();
        }

        public T setYear(int year) {
            this.year = year;
            return self();
        }

        public T setPrice(int price) {
            this.price = price;
            return self();
        }

        public abstract Vehicle build();

        protected abstract T self();
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    private Car(CarBuilder builder) {
        super(builder);
        this.numberOfDoors = builder.numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Doors: " + numberOfDoors;
    }

    public static class CarBuilder extends VehicleBuilder<CarBuilder> {
        private int numberOfDoors;

        public CarBuilder setNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        @Override
        public Car build() {
            return new Car(this);
        }

        @Override
        protected CarBuilder self() {
            return this;
        }
    }

    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setMake("Toyota")
                .setModel("Corolla")
                .setYear(2022)
                .setPrice(25000)
                .setNumberOfDoors(4)
                .build();

        System.out.println(car);
    }
}
