import copy

class Prototype:
    def clone(self):
        return copy.copy(self)

class ConcretePrototype(Prototype):
    def __init__(self, name):
        self.name = name

    def set_name(self, name):
        self.name = name

    def __str__(self):
        return f'ConcretePrototype{{name="{self.name}"}}'

class PrototypeManager:
    def __init__(self):
        self.prototypes = {}

    def add_prototype(self, key, prototype):
        self.prototypes[key] = prototype

    def get_prototype(self, key):
        return self.prototypes[key].clone()

if __name__ == "__main__":
    manager = PrototypeManager()

    prototype1 = ConcretePrototype("Prototype 1")
    prototype2 = ConcretePrototype("Prototype 2")
    manager.add_prototype("P1", prototype1)
    manager.add_prototype("P2", prototype2)

    cloned_prototype1 = manager.get_prototype("P1")
    cloned_prototype2 = manager.get_prototype("P2")

    print("Original Prototype 1:", prototype1)
    print("Cloned Prototype 1:", cloned_prototype1)

    print("Original Prototype 2:", prototype2)
    print("Cloned Prototype 2:", cloned_prototype2)
