import static org.junit.Assert.*;

import org.junit.Test;

public class PruebasDeCodigoTest {

	@Test
	public void testMetodo() {
		PruebasDeCodigo a = new PruebasDeCodigo();
		int resul = a.metodo(true,false,true);
		assertEquals(2,resul);
	}
	@Test
	public void testMetodo2() {
		PruebasDeCodigo a = new PruebasDeCodigo();
		int resul = a.metodo(true,true,true);
		assertEquals(1,resul);
	}
	@Test
	public void testMetodo3() {
		PruebasDeCodigo a = new PruebasDeCodigo();
		int resul = a.contar_letra("hola", 'a');
		assertEquals(1,resul);
	}
	@Test
	public void testMetodo4() {
		PruebasDeCodigo a = new PruebasDeCodigo();
		int resul = a.contar_letra("hola", 'e');
		assertEquals(0,resul);
	}
	@Test
	public void testMetodo5() {
		PruebasDeCodigo a = new PruebasDeCodigo();
		int resul = a.contar_letra("", 'e');
		assertEquals(0,resul);
	}
	@Test
	public void testMetodo6() {
		PruebasDeCodigo a = new PruebasDeCodigo();
		int resul = a.contar_letra("a", 'a');
		assertEquals(1,resul);
	}
}