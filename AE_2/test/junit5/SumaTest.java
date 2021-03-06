package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import Calculadora.Suma;

class SumaTest {

	@BeforeAll
	static void antesTodo() throws Exception {
		System.out.println("Inicio de los test sobre la clase Suma.");
	}

	@AfterAll
	static void despuesTodo() throws Exception {
		System.out.println("Fin de los test sobre la clase Suma.");
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
	 * Este test comprobar? que el resultado de la suma de dos n?meros reales positivos es correcto.
	 */
	@Test
	public void testSumaDosReales() {
		Suma s1 = new Suma();
		double a = 5.4;
		double b = 6.9;
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> s1.sumaDosReales(a, -b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> s1.sumaDosReales(-a, b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> s1.sumaDosReales(-a, -b));

		double resultado_esperado = a + b;
		double resultado_obtenido = s1.sumaDosReales(a, b);
		
		assertEquals(resultado_esperado, resultado_obtenido);
	}
	
	/**
	 * Este test comprobar? que el resultado de la suma de dos n?meros enteros positivos es correcto.
	 */
	@Test
	public void testSumaDosEnteros() {
		Suma s1 = new Suma();
		int a = 54;
		int b = 63;
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> s1.sumaDosReales(a, -b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> s1.sumaDosReales(-a, b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> s1.sumaDosReales(-a, -b));

		int resultado_esperado = a + b;
		int resultado_obtenido = s1.sumaDosEnteros(a, b);
		
		assertEquals(resultado_esperado, resultado_obtenido);
	}
	
	/**
	 * Este test comprobar? que el resultado de la suma de tres reales positivos es correcto.
	 */
	@Test
	public void testSumaTresReales() {
		Suma s1 = new Suma();
		double a = 5.4;
		double b = 6.9;
		double c = 7.1;
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> s1.sumaTresReales(-a, b, c));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> s1.sumaTresReales(a, -b, c));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> s1.sumaTresReales(a, b, -c));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> s1.sumaTresReales(-a, -b, c));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> s1.sumaTresReales(a, -b, -c));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> s1.sumaTresReales(-a, b, -c));

		assertThrows(
				IllegalArgumentException.class, 
				() -> s1.sumaTresReales(-a, -b, -c));
		
		double resultado_esperado = a + b + c;
		double resultado_obtenido = s1.sumaTresReales(a, b,c);
		
		assertEquals(resultado_esperado, resultado_obtenido);
	}
	
	/**
	 * Este test comprobar? que el resultado del m?todo sumaAcumulada() es correcto.
	 */
	@Test
	public void testSumaAcumulada() {
		Suma s1 = new Suma();
		double a = 1.2;
		 
		assertThrows(
				IllegalArgumentException.class, 
				() -> s1.sumaAcumulada(-a));

		double resultado_esperado = Suma.suma_acumulada + a;
		s1.sumaAcumulada(a);
		double resultado_obtenido = Suma.suma_acumulada;
		
		assertEquals(resultado_esperado, resultado_obtenido);
	}
}