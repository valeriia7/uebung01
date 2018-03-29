package ueb01;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class  CharStackTest {
	@Test
	void testCharStack() {
		CharStack cs = new CharStackImpl();

		// zu Beginn muss der Stack leer sein!
		assertEquals(0, cs.size());

		// ...und entsprechend eine NoSuchElementException werfen, wenn man pop ruft!
		assertThrows(NoSuchElementException.class, cs::pop);

		// jetzt ein paar Werte pushen
		char[] a = {'a', 'b', 'c'};
		for (char c : a)
			cs.push(c);
		// ...Groesse checken
		assertEquals(3, cs.size());

		// ...und rückwärts!
		for (int i = a.length-1; i >= 0; i--)
			assertEquals(a[i], cs.pop());

		// Jetzt muss er wieder leer sein!
		assertEquals(0, cs.size());
	}
}