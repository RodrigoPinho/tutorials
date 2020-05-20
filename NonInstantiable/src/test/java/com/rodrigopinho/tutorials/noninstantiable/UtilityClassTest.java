package com.rodrigopinho.tutorials.noninstantiable;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.jupiter.api.Test;

public class UtilityClassTest {

	@Test
	public void testConstructor() {
		try {
			Constructor<UtilityClass> constructor = UtilityClass.class.getDeclaredConstructor();
			constructor.setAccessible(true);

			assertThrows(InvocationTargetException.class, () -> {
				constructor.newInstance();
			});

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}

}
