public class PriceCalculator {
    private boolean exciseTax;
    private boolean incomeTax;
    private boolean valueAddedTax;
    private Country country;

    private PriceCalculator() {
    }

    public boolean isExciseTax() {
        return exciseTax;
    }

    public boolean isIncomeTax() {
        return incomeTax;
    }

    public boolean isValueAddedTax() {
        return valueAddedTax;
    }

    public Country getCountry() {
        return country;
    }

    public static class Builder {
        private boolean exciseTax;
        private boolean incomeTax;
        private boolean valueAddedTax;
        private Country country;

        public Builder() {
        }

        public Builder withExciseTax(boolean exciseTax) {
            this.exciseTax = exciseTax;
            return this;
        }

        public Builder withIncomeTax(boolean incomeTax) {
            this.incomeTax = incomeTax;
            return this;
        }

        public Builder withValueAddedTax(boolean valueAddedTax) {
            this.valueAddedTax = valueAddedTax;
            return this;
        }

        public Builder withCountry(Country country) {
            this.country = country;
            return this;
        }

        public PriceCalculator build() {
            PriceCalculator calculator = new PriceCalculator();
            calculator.exciseTax = this.exciseTax;
            calculator.incomeTax = this.incomeTax;
            calculator.valueAddedTax = this.valueAddedTax;
            calculator.country = this.country;
            return calculator;
        }
    }

    public enum Country {
        USA,
        Canada,
        UK,
        Australia
    }

    public static void main(String[] args) {
        PriceCalculator calculator = new PriceCalculator.Builder()
        .withExciseTax(true)
        .withIncomeTax(false)
        .withValueAddedTax(true)
        .withCountry(PriceCalculator.Country.USA)
        .build();

        System.out.println(calculator.getCountry() + " " + calculator.isExciseTax() + " " + calculator.isIncomeTax() + " " + calculator.isValueAddedTax());
    }
}
