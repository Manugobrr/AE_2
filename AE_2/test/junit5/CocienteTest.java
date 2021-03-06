package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import Calculadora.Cociente;

class CocienteTest {

	@BeforeAll
    static void antesTodo() throws Exception {
        System.out.println("Inicio de los test sobre la clase Cociente. ");
    }

    @AfterAll
    static void despuesTodo() throws Exception {
        System.out.println("Fin de los test sobre la clase Cociente. ");
    }

    @BeforeEach
    public void inicioDeTest(TestInfo testing) {
        System.out.println("Empezando " + testing.getDisplayName());
    }

    @AfterEach
    public void finDeTest(TestInfo testing) {
        System.out.println("Test finalizado, Wakanda Forever " + testing.getDisplayName());
    }


	/**
	 * Este test comprobar? que el resultado del cociente de dos n?meros reales positivos es correcto.
	 */
	@Test
	public void testCocienteDosReales() {
		Cociente c1 = new Cociente();
		double a = 5.4;
		double b = 6.9;
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> c1.cocienteDosReales(a, -b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> c1.cocienteDosReales(-a, b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> c1.cocienteDosReales(-a, -b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> c1.cocienteDosReales(a, 0));

		double resultado_esperado = a/b;
		double resultado_obtenido = c1.cocienteDosReales(a, b);
		
		assertEquals(resultado_esperado, resultado_obtenido);
	}
	
	/**
	 * Este test comprobar? que el resultado del cociente de dos n?meros enteros positivos es correcto.
	 */
	@Test
	public void testCocienteDosEnteros() {
		Cociente c1 = new Cociente();
		int a = 54;
		int b = 63;
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> c1.cocienteDosEnteros(a, -b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> c1.cocienteDosEnteros(-a, b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> c1.cocienteDosEnteros(-a, -b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> c1.cocienteDosEnteros(a, 0));

		double resultado_esperado = (double)a/(double)b;
		double resultado_obtenido = c1.cocienteDosEnteros(a, b);
		
		assertEquals(resultado_esperado, resultado_obtenido);
	}
	
	/**
	 * Este test comprobar? que el resultado del inverso de un n?mero real positivo es correcto.
	 */
	@Test
	public void testInverso() {
		Cociente c1 = new Cociente();
		double a = 5.4;
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> c1.inverso(-a));

		assertThrows(
				IllegalArgumentException.class, 
				() -> c1.inverso(0));
		
		double resultado_esperado = 1/a;
		double resultado_obtenido = c1.inverso(a);
		
		assertEquals(resultado_esperado, resultado_obtenido);
	}
	
	/**
	 * Este test comprobar? que el resultado de la ra?z de un n?mero real positivo es correcto.
	 */
	@Test
	public void testRaiz() {
		Cociente c1 = new Cociente();
		double a = 16;
		 
		assertThrows(
				IllegalArgumentException.class, 
				() -> c1.raiz(-a));

		double resultado_esperado = Math.sqrt(a);
		double resultado_obtenido = c1.raiz(a);
		
		assertEquals(resultado_esperado, resultado_obtenido);
	}
}