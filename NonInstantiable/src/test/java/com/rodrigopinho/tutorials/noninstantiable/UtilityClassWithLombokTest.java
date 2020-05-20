package com.rodrigopinho.tutorials.noninstantiable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.jupiter.api.Test;

public class UtilityClassWithLombokTest {
	
	@Test
	public void testConstructor() {
		try {
			Constructor<UtilityClassWithLombok> constructor = UtilityClassWithLombok.class.getDeclaredConstructor();
			constructor.setAccessible(true);

			assertThrows(InvocationTargetException.class, () -> {
				constructor.newInstance();
			});

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testMethodAccess() {
		assertEquals(10, UtilityClassWithLombok.addSomething(5));
	}
}
