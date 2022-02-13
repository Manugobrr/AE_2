package Calculadora;
/**
 * La clase <b>Producto</b> contiene los métodos relacionados con las multiplicaciones de la calculadora.
 * 
 * @author Hugo Merino Sahagun
 * @version 1.6
 * 
 */

public class Producto {
	// CONSTRUCTORES
	/**
	 * Constructor estándar.
	 */
	public Producto() {
	}

	
	// MÉTODOS
	/**
	 * Método que devuelve el resultado del <b>producto de dos números</b> introducidos. 
	 * 
	 * @author Hugo Merino Sahagun
	 * @since 0.8
	 * 
	 * @param num1 El primer término.
	 * @param num2 El segundo término.
	 * @return Devuelve el resultado de multiplicar los dos valores introducidos.
	 * @deprecated
	 */
	public double producto(double num1, double num2) {/*
		return num1*num2;*/
		return 0;
	}
	/**
	 * Método que devuelve el resultado del <b>producto de dos números reales</b> introducidos. 
	 * 
	 * @author Hugo Merino Sahagun
	 * @since 1.0
	 * 
	 * @param num1 El primer término.
	 * @param num2 El segundo término.
	 * @return Devuelve el resultado de multiplicar los dos valores introducidos.
	 * @throws IllegalArgumentException Cuando alguno de los números introducidos es negativo.
	 */
	public double productoDosReales(double num1, double num2) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Ambos números deben ser positivos");
		}
		return num1*num2;
	}
	
	/**
	 * Método que devuelve el resultado del <b>producto de dos números enteros</b> introducidos.
	 * 
	 * @author Hugo Merino Sahagun
	 * @since 1.0
	 * 
	 * @param num1 El primer término.
	 * @param num2 El segundo término.
	 * @return Devuelve el resultado de multiplicar los dos valores introducidos.
	 * @throws IllegalArgumentException Cuando alguno de los números introducidos es negativo.
	 */
	public int productoDosEnteros(int num1, int num2) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Ambos números deben ser positivos");
		}
		return num1*num2;
	}

	/**
	 * Método que devuelve el resultado del <b>producto de tres números reales</b> introducidos.
	 * 
	 * @author Hugo Merino Sahagun
	 * @since 1.0
	 * 
	 * @param num1 El primer término.
	 * @param num2 El segundo término.
	 * @param num3 El tercer término.
	 * @return Devuelve el resultado de multiplicar los tres valores introducidos.
	 * @throws IllegalArgumentException Cuando alguno de los números introducidos es negativo.
	 */
	public double productoTresReales(double num1, double num2, double num3) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0 || num3 < 0) {
			throw new IllegalArgumentException("Todos los números deben ser positivos");
		}
		return num1*num2*num3;
	}
	
	/**
	 * Método que devuelve el valor de la <b>potencia de los números enteros</b> introducidos. 
	 * El primer parámetro es la base, el segundo el exponente.	
	 * En caso de que alguno de los números introducidos sea negativo arroja una excepción.
	 * En caso de que los números introducidos sean demasiado grandes arroja una excepción.
	 * 
	 * @author Hugo Merino Sahagun
	 * @since 1.0
	 * 
	 * @param num1 La base.
	 * @param num2 El exponente.
	 * @return Devuelve el resultado de elevar el primer número introducido al segundo.
	 * @throws IllegalArgumentException Cuando alguno de los números introducidos es negativo.
	 * @throws ArithmeticException Cuando el resultado sobrepasa el valor máximo del tipo de dato (double).
	 */
	public double potencia(double num1, double num2) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Todos los números deben ser positivos");
		}
		else if (Math.pow(num1, num2)>=Double.MAX_VALUE) {
			throw new ArithmeticException("El resultado no puede ser calculado");
		}
		return Math.pow(num1, num2);
	}
}