package com.rroggia.factoryMethod.implementation;

public class ConcreteCreator extends Creator {

	@Override
	public Product createProduct() {
		return new ConcreteProduct();
	}

}
