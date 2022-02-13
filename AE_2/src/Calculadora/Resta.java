package Calculadora;
/**
 *  La clase <b>Resta</b> contiene los m�todos relacionados con las restas de la calculadora.
 * 
 * @author Manuel Prado Mira
 * @version 1.6
 * 
 */
public class Resta {
	// ATRIBUTOS DE CLASE
	/**
	 * Esta propiedad reprensenta el valor de la resta acumulada, que utilizaremos en el m�todo 
	 * {@link #restaAcumulada(double)} definido debajo.
	 */
	public static double resta_acumulada = 0;
	
	
	// CONSTRUCTORES
	/**
	 * Constructor est�ndar.
	 */
	public Resta() {

	}

	
	// M�TODOS
	/**
	 * M�todo que devuelve el resultado de la <b>resta de dos n�meros reales</b> introducidos. 
	 * 
	 * @author Manuel Prado Mira
	 * @since 1.0
	 * 
	 * @param num1 El minuendo.
	 * @param num2 El sustraendo.
	 * @return Devuelve el resultado de restar los dos valores introducidos.
	 * @throws IllegalArgumentException Cuando alguno de los n�meros introducidos es negativo.
	 */
	public double restaDosReales(double num1, double num2) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Ambos n�meros deben ser positivos");
		}
		return num1 - num2;
	}
	
	/**
	 * M�todo que devuelve el resultado de la <b>resta de dos n�meros enteros</b> introducidos. 
	 * 
	 * @author Manuel Prado Mira
	 * @since 1.0
	 * 
	 * @param num1 El minuendo.
	 * @param num2 El sustraendo.
	 * @return Devuelve el resultado de restar los dos valores introducidos.
 	 * @throws IllegalArgumentException Cuando alguno de los n�meros introducidos es negativo.
	 */
	public int restaDosEnteros(int num1, int num2) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Ambos n�meros deben ser positivos");
		}
		return num1 - num2;
	}

	/**
	 * M�todo que devuelve el resultado de la <b>resta de tres n�meros reales</b> introducidos.
	 * Resta el segundo y el tercer n�mero introducido al original. 
	 * 
	 * @author Manuel Prado Mira
	 * @since 1.0
	 * 
	 * @param num1 El minuendo.
	 * @param num2 El primer sustraendo.
	 * @param num3 El segundo sustraendo.
	 * @return Devuelve el resultado de restar al primero n�mero introducido los otros dos.
	 * @throws IllegalArgumentException Cuando alguno de los n�meros introducidos es negativo.
	 */
	public double restaTresReales(double num1, double num2, double num3) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0 || num3 < 0) {
			throw new IllegalArgumentException("Todos los n�meros deben ser positivos");
		}
		return num1 - num2 - num3;
	}
	
	/**
	 * M�todo que sustrae el valor del par�metro introducido a una variable que acumula el resultado. 
	 * Es una variable est�tica, se puede acceder a ella escribiendo Resta.resta_acumulada.
	 * 
	 * @author Manuel Prado Mira
	 * @since 1.0
	 * 
	 * @param num1 El sustraendo.
	 * @throws IllegalArgumentException Cuando el n�mero introducido es negativo.
	 */
	public void restaAcumulada(double num1) throws IllegalArgumentException {
		if (num1 < 0) {
			throw new IllegalArgumentException("El sumando debe ser positivo");
		}
		resta_acumulada-= num1;
	}
}