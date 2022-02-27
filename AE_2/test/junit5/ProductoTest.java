package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import Calculadora.Producto;

class ProductoTest {

	@BeforeAll
    static void antesTodo() throws Exception {
        System.out.println("Inicio de los test sobre la clase Producto.");
    }

    @AfterAll
    static void despuesTodo() throws Exception {
        System.out.println("Fin de los test sobre la clase Producto.");
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
	 * Este test comprobará que el resultado del producto de dos números reales positivos es correcto.
	 */
	@Test
	public void testProductoDosReales() {
		Producto p1 = new Producto();
		double a = 5.4;
		double b = 6.9;
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> p1.productoDosReales(a, -b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> p1.productoDosReales(-a, b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> p1.productoDosReales(-a, -b));
		
		double resultado_esperado = a*b;
		double resultado_obtenido = p1.productoDosReales(a, b);
		
		assertEquals(resultado_esperado, resultado_obtenido);
	}
	
	/**
	 * Este test comprobará que el resultado del producto de dos números enteros positivos es correcto.
	 */
	@Test
	public void testProductoDosEnteros() {
		Producto p1 = new Producto();
		int a = 54;
		int b = 63;
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> p1.productoDosEnteros(a, -b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> p1.productoDosEnteros(-a, b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> p1.productoDosEnteros(-a, -b));
		
		int resultado_esperado = a*b;
		int resultado_obtenido = p1.productoDosEnteros(a, b);
		
		assertEquals(resultado_esperado, resultado_obtenido);
	}
	
	/**
	 * Este test comprobará que el resultado del producto de tres números reales positivos es correcto.
	 */
	@Test
	public void testProductoTresReales() {
		Producto p1 = new Producto();
		double a = 5.4;
		double b = 6.9;
		double c = 7.1;
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> p1.productoTresReales(-a, b, c));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> p1.productoTresReales(a, -b, c));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> p1.productoTresReales(a, b, -c));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> p1.productoTresReales(-a, -b, c));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> p1.productoTresReales(a, -b, -c));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> p1.productoTresReales(-a, b, -c));

		assertThrows(
				IllegalArgumentException.class, 
				() -> p1.productoTresReales(-a, -b, -c));
		
		double resultado_esperado = a*b*c;
		double resultado_obtenido = p1.productoTresReales(a, b, c);
		
		assertEquals(resultado_esperado, resultado_obtenido);
	}
	
	/**
	 * Este test comprobará que el resultado de la raíz de un número real positivo es correcto.
	 */
	@Test
	public void testPotencia() {
		Producto p1 = new Producto();
		double a = 16;
		double b = 2;
		double c = 300;	// Para comprobar la potencia, cogiendo un valor que exceda 1.7*10^308 que es valor máximo de un double.
		 
		assertThrows(
				IllegalArgumentException.class, 
				() -> p1.potencia(a, -b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> p1.potencia(-a, b));
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> p1.potencia(-a, -b));
		
		assertThrows(
				ArithmeticException.class, 
				() -> p1.potencia(a, c));	

		double resultado_esperado = Math.pow(a,b);
		double resultado_obtenido = p1.potencia(a,b);
		
		assertEquals(resultado_esperado, resultado_obtenido);
	}
}