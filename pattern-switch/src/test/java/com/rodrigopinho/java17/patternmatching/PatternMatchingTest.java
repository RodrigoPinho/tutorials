package com.rodrigopinho.java17.patternmatching;

import com.rodrigopinho.java17.patternmatching.PatternMatching;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class PatternMatchingTest {

	@Test
	void testGetTypeMessage() {
		assertThat(PatternMatching.getPatternMatchingMessage("Test"))
				.isEqualTo("Type: String, value: Test");

		assertThat(PatternMatching.getPatternMatchingMessage(123))
				.isEqualTo("Type: Integer, value: 123");

		assertThat(PatternMatching.getPatternMatchingMessage(null))
				.isEqualTo("Null object");

		assertThat(PatternMatching.getPatternMatchingMessage(123L))
				.isEqualTo("Type: Unknown, value: 123");
	}

	@Test
	void testGetGuardedPatternMessage() {
		assertThat(PatternMatching.getGuardedPatternMessage("This is a big string"))
				.isEqualTo("Big string, size: 20");

		assertThat(PatternMatching.getGuardedPatternMessage("Small str"))
				.isEqualTo("Small string, size: 9");

		assertThat(PatternMatching.getGuardedPatternMessage(2.5))
				.isEqualTo("Unsupported Object: Double");
	}
}
