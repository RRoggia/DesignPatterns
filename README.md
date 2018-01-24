# DesignPatterns
Design Patterns implementation


## FlyWeight
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
