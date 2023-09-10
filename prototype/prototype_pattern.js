class Prototype {
    clone() {
        return Object.assign({}, this);
    }
}

class ConcretePrototype extends Prototype {
    constructor(name) {
        super();
        this.name = name;
    }

    setName(name) {
        this.name = name;
    }

    toString() {
        return `ConcretePrototype{name="${this.name}"}`;
    }
}

class PrototypeManager {
    constructor() {
        this.prototypes = {};
    }

    addPrototype(key, prototype) {
        this.prototypes[key] = prototype;
    }

    getPrototype(key) {
        return this.prototypes[key].clone();
    }
}

const manager = new PrototypeManager();

const prototype1 = new ConcretePrototype("Prototype 1");
const prototype2 = new ConcretePrototype("Prototype 2");
manager.addPrototype("P1", prototype1);
manager.addPrototype("P2", prototype2);

const clonedPrototype1 = manager.getPrototype("P1");
const clonedPrototype2 = manager.getPrototype("P2");

console.log("Original Prototype 1:", prototype1.toString());
console.log("Cloned Prototype 1:", clonedPrototype1.toString());

console.log("Original Prototype 2:", prototype2.toString());
console.log("Cloned Prototype 2:", clonedPrototype2.toString());
