package com.rroggia.factoryMethod.implementation;

public abstract class Creator {

	private Product product = createProduct();

	public abstract Product createProduct();

	public void anOperation() {
		product.operation1();
		product.operation2();
	};

}
