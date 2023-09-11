class Coffee:
    def get_description(self):
        pass

    def cost(self):
        pass

class SimpleCoffee(Coffee):
    def get_description(self):
        return "Simple Coffee"

    def cost(self):
        return 2.0

class CoffeeDecorator(Coffee):
    def __init__(self, decorated_coffee):
        self.decorated_coffee = decorated_coffee

    def get_description(self):
        return self.decorated_coffee.get_description()

    def cost(self):
        return self.decorated_coffee.cost()

class MilkDecorator(CoffeeDecorator):
    def __init__(self, decorated_coffee):
        super().__init__(decorated_coffee)

    def get_description(self):
        return self.decorated_coffee.get_description() + ", Milk"

    def cost(self):
        return self.decorated_coffee.cost() + 0.5

class SugarDecorator(CoffeeDecorator):
    def __init__(self, decorated_coffee):
        super().__init__(decorated_coffee)

    def get_description(self):
        return self.decorated_coffee.get_description() + ", Sugar"

    def cost(self):
        return self.decorated_coffee.cost() + 0.2

if __name__ == "__main__":
    simple_coffee = SimpleCoffee()
    print(f"Simple Coffee: {simple_coffee.get_description()}, Cost: ${simple_coffee.cost()}")

    milk_coffee = MilkDecorator(SimpleCoffee())
    print(f"Milk Coffee: {milk_coffee.get_description()}, Cost: ${milk_coffee.cost()}")

    sugar_milk_coffee = SugarDecorator(MilkDecorator(SimpleCoffee()))
    print(f"Sugar Milk Coffee: {sugar_milk_coffee.get_description()}, Cost: ${sugar_milk_coffee.cost()}")
