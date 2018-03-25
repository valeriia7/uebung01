package ueb01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromTest {
	@Test
	void testPalindrom() {
		String[] xs = {
				"Ein Neger mit Gazelle zagt im Regen nie",
				"Anna",
				"Regallager",
				"Eine güldne, gute Tugend: Lüge nie",
				"a",
				"bb"
		};

		for (String s : xs)
			assertTrue(Palindrom.istPalindrom(s));

		String[] zs = {
				"hansdampf",
				"peter pan",
				"quatsch mit sosse",
				"ab"
		};

		for (String s : zs)
			assertFalse(Palindrom.istPalindrom(s));
	}
}