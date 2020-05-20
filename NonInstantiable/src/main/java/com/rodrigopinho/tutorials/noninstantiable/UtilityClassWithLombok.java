package com.rodrigopinho.tutorials.noninstantiable;

import lombok.experimental.UtilityClass;

@UtilityClass
public class UtilityClassWithLombok {
	private final int CONSTANT = 5;

	public int addSomething(int in) {
		return in + CONSTANT;
	}
}
