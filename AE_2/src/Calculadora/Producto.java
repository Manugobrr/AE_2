package Calculadora;
/**
 * La clase <b>Producto</b> contiene los m�todos relacionados con las multiplicaciones de la calculadora.
 * 
 * @author Hugo Merino Sahagun
 * @version 1.6
 * 
 */

public class Producto {
	// CONSTRUCTORES
	/**
	 * Constructor est�ndar.
	 */
	public Producto() {
	}

	
	// M�TODOS
	/**
	 * M�todo que devuelve el resultado del <b>producto de dos n�meros</b> introducidos. 
	 * 
	 * @author Hugo Merino Sahagun
	 * @since 0.8
	 * 
	 * @param num1 El primer t�rmino.
	 * @param num2 El segundo t�rmino.
	 * @return Devuelve el resultado de multiplicar los dos valores introducidos.
	 * @deprecated
	 */
	public double producto(double num1, double num2) {/*
		return num1*num2;*/
		return 0;
	}
	/**
	 * M�todo que devuelve el resultado del <b>producto de dos n�meros reales</b> introducidos. 
	 * 
	 * @author Hugo Merino Sahagun
	 * @since 1.0
	 * 
	 * @param num1 El primer t�rmino.
	 * @param num2 El segundo t�rmino.
	 * @return Devuelve el resultado de multiplicar los dos valores introducidos.
	 * @throws IllegalArgumentException Cuando alguno de los n�meros introducidos es negativo.
	 */
	public double productoDosReales(double num1, double num2) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Ambos n�meros deben ser positivos");
		}
		return num1*num2;
	}
	
	/**
	 * M�todo que devuelve el resultado del <b>producto de dos n�meros enteros</b> introducidos.
	 * 
	 * @author Hugo Merino Sahagun
	 * @since 1.0
	 * 
	 * @param num1 El primer t�rmino.
	 * @param num2 El segundo t�rmino.
	 * @return Devuelve el resultado de multiplicar los dos valores introducidos.
	 * @throws IllegalArgumentException Cuando alguno de los n�meros introducidos es negativo.
	 */
	public int productoDosEnteros(int num1, int num2) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Ambos n�meros deben ser positivos");
		}
		return num1*num2;
	}

	/**
	 * M�todo que devuelve el resultado del <b>producto de tres n�meros reales</b> introducidos.
	 * 
	 * @author Hugo Merino Sahagun
	 * @since 1.0
	 * 
	 * @param num1 El primer t�rmino.
	 * @param num2 El segundo t�rmino.
	 * @param num3 El tercer t�rmino.
	 * @return Devuelve el resultado de multiplicar los tres valores introducidos.
	 * @throws IllegalArgumentException Cuando alguno de los n�meros introducidos es negativo.
	 */
	public double productoTresReales(double num1, double num2, double num3) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0 || num3 < 0) {
			throw new IllegalArgumentException("Todos los n�meros deben ser positivos");
		}
		return num1*num2*num3;
	}
	
	/**
	 * M�todo que devuelve el valor de la <b>potencia de los n�meros enteros</b> introducidos. 
	 * El primer par�metro es la base, el segundo el exponente.	
	 * En caso de que alguno de los n�meros introducidos sea negativo arroja una excepci�n.
	 * En caso de que los n�meros introducidos sean demasiado grandes arroja una excepci�n.
	 * 
	 * @author Hugo Merino Sahagun
	 * @since 1.0
	 * 
	 * @param num1 La base.
	 * @param num2 El exponente.
	 * @return Devuelve el resultado de elevar el primer n�mero introducido al segundo.
	 * @throws IllegalArgumentException Cuando alguno de los n�meros introducidos es negativo.
	 * @throws ArithmeticException Cuando el resultado sobrepasa el valor m�ximo del tipo de dato (double).
	 */
	public double potencia(double num1, double num2) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Todos los n�meros deben ser positivos");
		}
		else if (Math.pow(num1, num2)>=Double.MAX_VALUE) {
			throw new ArithmeticException("El resultado no puede ser calculado");
		}
		return Math.pow(num1, num2);
	}
}