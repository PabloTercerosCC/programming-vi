
class Coffee {
  getDescription() {}
  cost() {}
}

class SimpleCoffee extends Coffee {
  getDescription() {
    return "Simple Coffee";
  }

  cost() {
    return 2.0;
  }
}

class CoffeeDecorator extends Coffee {
  constructor(decoratedCoffee) {
    super();
    this.decoratedCoffee = decoratedCoffee;
  }

  getDescription() {
    return this.decoratedCoffee.getDescription();
  }

  cost() {
    return this.decoratedCoffee.cost();
  }
}

class MilkDecorator extends CoffeeDecorator {
  constructor(decoratedCoffee) {
    super(decoratedCoffee);
  }

  getDescription() {
    return `${this.decoratedCoffee.getDescription()}, Milk`;
  }

  cost() {
    return this.decoratedCoffee.cost() + 0.5;
  }
}

class SugarDecorator extends CoffeeDecorator {
  constructor(decoratedCoffee) {
    super(decoratedCoffee);
  }

  getDescription() {
    return `${this.decoratedCoffee.getDescription()}, Sugar`;
  }

  cost() {
    return this.decoratedCoffee.cost() + 0.2;
  }
}

const simpleCoffee = new SimpleCoffee();
console.log(`Simple Coffee: ${simpleCoffee.getDescription()}, Cost: $${simpleCoffee.cost()}`);

const milkCoffee = new MilkDecorator(new SimpleCoffee());
console.log(`Milk Coffee: ${milkCoffee.getDescription()}, Cost: $${milkCoffee.cost()}`);

const sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
console.log(`Sugar Milk Coffee: ${sugarMilkCoffee.getDescription()}, Cost: $${sugarMilkCoffee.cost()}`);
