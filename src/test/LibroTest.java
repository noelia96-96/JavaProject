package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.OperacionesLibro;
import model.Libro;

class LibroTest {

	@Test
	void testAplicarVale() {
		Libro l1 = new Libro ("Abril", "Ellie", "Ambar", 10, 5);
		assertEquals(5, OperacionesLibro.aplicarVale(l1));
		
	}
	
	@Test
	void testOferta() {
		Libro l1 = new Libro ("Abril", "Ellie", "Ambar", 12, 5);
		assertEquals(false, OperacionesLibro.oferta(l1));
		
	}

}
