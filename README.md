# DesignPatterns
Design Patterns implementation

## Creational Pattern

### Abstract Factory
`TODO`

### Builder

Example:
```` java
Builder builder = new ConcreteBuilder();
Director director = new Director(builder);
director.constructPartOne("One");
director.constructPartTwo("Two");
Product product = builder.getProduct();
System.out.println(product);
````
Output:
```` console
Product [partOne=One, partTwo=Two]
````
### Factory Method
`TODO`

### Prototype
`TODO`

### Singleton

Example:
````java
System.out.print("Get Instance 1st time: ");
System.out.println(Singleton.getInstance());

System.out.print("Get Instance 2nd time: ");
System.out.println(Singleton.getInstance());

System.out.print("Is the instance the same? ");
System.out.println(Singleton.getInstance() == Singleton.getInstance());

System.out.print("Data: ");
System.out.println(Singleton.getInstance().getData());
````

Output:
```` console
Get Instance 1st time: com.rroggia.singleton.implementation.Singleton@7852e922
Get Instance 2nd time: com.rroggia.singleton.implementation.Singleton@7852e922
Is the instance the same? true
Data: Same Data
````

[Singleton Implementation](https://github.com/RRoggia/DesignPatterns/tree/master/src/com/rroggia/singleton)

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
