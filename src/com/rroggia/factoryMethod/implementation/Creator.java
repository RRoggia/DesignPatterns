package com.rroggia.factoryMethod.implementation;

public abstract class Creator {

	public abstract Product createProduct();

	public void anOperation() {
		Product product = createProduct();
		product.operation1();
		product.operation2();
	};

}
