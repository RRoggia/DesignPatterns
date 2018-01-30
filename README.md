# DesignPatterns
Design Patterns implementation

## Creational Pattern

### Builder

## Structural Pattern

### FlyWeight
* Intrinsic State: Represents what is in common between the flyweight objects. It's stored in the `ConcreteFlyweight` class. E.g. Characters
* Extrinsic State: Represents the variations that can be combined with the Intrinsic State. The `Client` class injects the Extrinsic State through the signature avaialble in the `Flyweight` interface. E.g. Fonts

[FlyWeight Implementation](https://github.com/RRoggia/DesignPatterns/tree/master/src/com/rroggia/flyweight)

Example:
```` java
flyweight = FlyweightFactory.getFlyweight("Hello");
flyweight.operation("World!.");
flyweight.operation("Darkness my old friend.");
````
Output:
````console
Hello World!.
Hello Darkness my old friend.
````

### Bridge
* The `Client` class will consume the `Abstraction` class, which is responsible for define the interface.
* The `Abstraction` class "delegates" the processing to a one of the `ConcreteImplementator` that implements the `Implementor` interface.
* The `RefinedAbstraction` (Subclass) can enhance the existing interface by:
    * adding new methods in the subclass  (need to use the SubClass instance instead of Superclass instance) 
    * overwriting the Abstraction methods

[Bridge Implementation](https://github.com/RRoggia/DesignPatterns/tree/master/src/com/rroggia/bridge)
