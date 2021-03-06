package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import Calculadora.Resta;

class RestaTest {

	@BeforeAll
	static void antesTodo() throws Exception {
		System.out.println("Inicio de los test sobre la clase Resta.");
	}

	@AfterAll
	static void despuesTodo() throws Exception {
		System.out.println("Fin de los test sobre la clase Resta.");
	}

    @BeforeEach
    public void inicioDeTest(TestInfo testing) {
        System.out.println("Empezando " + testing.getDisplayName());
    }

    @AfterEach
    public void finDeTest(TestInfo testing) {
        System.out.println("Finalizado " + testing.getDisplayName());
    }

	/**
	 * Este test comprobar? que el resultado de la resta de dos n?meros reales positivos es correcto.
	 */
	@Test
	public void testRestaDosReales() {
		Resta r1 = new Resta();
		double a = 5.4;
		double b = 6.9;
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> r1.restaDosReales(a, -b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> r1.restaDosReales(-a, b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> r1.restaDosReales(-a, -b));

		double resultado_esperado = a - b;
		double resultado_obtenido = r1.restaDosReales(a, b);
		
		assertEquals(resultado_esperado, resultado_obtenido);
	}
	
	/**
	 * Este test comprobar? que el resultado de la resta de dos n?meros enteros positivos es correcto.
	 */
	@Test
	public void testRestaDosEnteros() {
		Resta r1 = new Resta();
		int a = 54;
		int b = 63;
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> r1.restaDosEnteros(a, -b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> r1.restaDosEnteros(-a, b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> r1.restaDosEnteros(-a, -b));

		int resultado_esperado = a - b;
		int resultado_obtenido = r1.restaDosEnteros(a, b);
		
		assertEquals(resultado_esperado, resultado_obtenido);
	}
	
	/**
	 * Este test comprobar? que el resultado de la resta de tres n?meros reales positivos es correcto.
	 */
	@Test
	public void testRestaTresReales() {
		Resta r1 = new Resta();
		double a = 5.4;
		double b = 6.9;
		double c = 7.1;
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> r1.restaTresReales(-a, b, c));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> r1.restaTresReales(a, -b, c));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> r1.restaTresReales(a, b, -c));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> r1.restaTresReales(-a, -b, c));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> r1.restaTresReales(a, -b, -c));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> r1.restaTresReales(-a, b, -c));

		assertThrows(
				IllegalArgumentException.class, 
				() -> r1.restaTresReales(-a, -b, -c));
		
		double resultado_esperado = a - b - c;
		double resultado_obtenido = r1.restaTresReales(a, b,c);
		
		assertEquals(resultado_esperado, resultado_obtenido);
	}
	
	/**
	 * Este test comprobar? que el resultado del m?todo sumaAcumulada() es correcto.
	 */
	@Test
	public void testRestaAcumulada() {
		Resta r1 = new Resta();
		double a = 1.2;
		 
		assertThrows(
				IllegalArgumentException.class, 
				() -> r1.restaAcumulada(-a));

		double resultado_esperado = Resta.resta_acumulada - a;
		r1.restaAcumulada(a);
		double resultado_obtenido = Resta.resta_acumulada;
		
		assertEquals(resultado_esperado, resultado_obtenido);
	}
}