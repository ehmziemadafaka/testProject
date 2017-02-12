
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PruebaPila {

	Pila pila_plena;
	Pila pila_buida;

	@Before
	public void setUp() {
		pila_buida = new Pila();
		pila_plena = new Pila();
		pila_plena.apilar(1);
		pila_plena.apilar(2);
		pila_plena.apilar(3);
		pila_plena.apilar(4);
	}

	@Test
	public void testGetNumElements() {
		int valor = 0;
		valor = pila_plena.getNumElements();
		assertEquals(pila_plena.getNumElements(), 4);
	}

	@Test
	public void testPilaBuida() {
		assertEquals(pila_buida.getNumElements(), 0);
	}

	@Test
	public void testApilar() {
		Integer i = new Integer(5);
		int mida = pila_plena.getNumElements();
		pila_plena.apilar(i);
		assertEquals(pila_plena.getNumElements(), mida + 1);
	}

	@Test
	public void testDesapilar_pilaPlena() {
		int mida = pila_plena.getNumElements();
		Integer i = (Integer) pila_plena.desapilar();
		assertEquals(i, new Integer(4));
		assertEquals(pila_plena.getNumElements(), mida - 1);
	}

	@Test
	public void testDesapilar_pilaBuida() {
		int mida = pila_buida.getNumElements();
		Integer i = (Integer) pila_buida.desapilar();
		assertEquals(i, null);
		assertEquals(pila_buida.getNumElements(), mida);
	}
}
