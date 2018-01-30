package com.rroggia.builder;

import com.rroggia.builder.implementation.Builder;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void constructPartOne(String partOne) {
		builder.addPartOne(partOne);
	}

	public void constructPartTwo(String partTwo) {
		builder.addPartTwo(partTwo);
	}

}