# DesignPatterns
Design Patterns implementation in java

1. [Creational Pattern](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#creational-pattern)
* [Abstract Factory](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#abstract-factory)
* [Builder](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#builder)
* [Factory Method](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#factory-method)
* [Prototype](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#prototype)
* [Singleton](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#singleton)
2. [Structural Pattern](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#structural-pattern)
3. [Behavioral Pattern](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#behavioral-pattern)



## Creational Pattern

### Abstract Factory
`TODO`

### Builder
* Ease the construction of complex objects
* Good for cases where `Product` can have lots of optionals parameters, the `Builder` makes the API flexible by allowing only to add the required fields

[Builder Implementation](https://github.com/RRoggia/DesignPatterns/tree/master/src/com/rroggia/builder)

Example:
```` java
Builder builder = new ConcreteBuilder();
Director director = new Director(builder);
director.construct();
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
* Ensure the `Singleton` class has only one instance
* The `Singleton` itself is responsible for the management of the its instances
* A variation of this pattern, is to have a registry of singletons where subclasses register theirself to the `Singleton`, and the instance to be created is defined in runtime, for example, by a enviroment parameter

[Singleton Implementation](https://github.com/RRoggia/DesignPatterns/tree/master/src/com/rroggia/singleton)

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
* The `Client` class will consume the `Abstraction` class, which is responsible for define the interface
* The `Abstraction` class "delegates" the processing to a one of the `ConcreteImplementator` that implements the `Implementor` interface
* The `RefinedAbstraction` (Subclass) can enhance the existing interface by:
    * adding new methods in the subclass  (need to use the SubClass instance instead of Superclass instance) 
    * overwriting the Abstraction methods

[Bridge Implementation](https://github.com/RRoggia/DesignPatterns/tree/master/src/com/rroggia/bridge)

Example:
````java
		Abstraction abstraction = new Abstraction(1);
		abstraction.operation();

		Abstraction abstraction2 = new Abstraction(100);
		abstraction2.operation();
		
		Abstraction abstraction3 = new RefinedAbstraction(10);
		abstraction3.operation();		
````

Output:
````console
primitive Operation One - Concrete Implementation A.
primitive Operation Two - Concrete Implementation A.
primitive Operation One - Concrete Implementation B.
primitive Operation Two - Concrete Implementation B.
The refined Abstraction do more things
primitive Operation One - Concrete Implementation B.
primitive Operation Two - Concrete Implementation B.
````

## Behavioral pattern
