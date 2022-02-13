
package Calculadora;

/**
 * La clase <b>Suma</b> contiene los m�todos relacionados con las sumas de la calculadora.
 * 
 * @author Manuel Prado Mira
 * @version 1.6
 * 
 */

public class Suma {
	// ATRIBUTOS DE CLASE
	/**
	 * Esta propiedad reprensenta el valor de la suma acumulada, que utilizaremos en el m�todo 
	 * {@link #sumaAcumulada(double)} definido debajo.
	 */
	public static double suma_acumulada = 0;
	
	
	// CONSTRUCTORES
	/**
	 * Constructor est�ndar.
	 */
	public Suma() {

	}

	
	// M�TODOS
	/**
	 * M�todo que devuelve el resultado de la <b>suma de dos n�meros reales</b> introducidos. 
	 * 
	 * @author Manuel Prado Mira
	 * @since 1.0
	 * 
	 * @param num1 El primer sumando.
	 * @param num2 El segundo sumando.
	 * @return Devuelve el resultado de sumar los dos valores introducidos.
	 * @throws IllegalArgumentException Cuando alguno de los n�meros introducidos es negativo.
	 */
	public double sumaDosReales(double num1, double num2) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Ambos sumandos deben ser positivos");
		}
		return num1 + num2;
	}
	
	/**
	 * M�todo que devuelve el resultado de la <b>suma de dos n�meros enteros</b> introducidos. 
	 * 
	 * @author Manuel Prado Mira
	 * @since 1.0
	 * 
	 * @param num1 El primer sumando.
	 * @param num2 El segundo sumando.
	 * @return Devuelve el resultado de sumar los dos valores introducidos.
	 * @throws IllegalArgumentException Cuando alguno de los n�meros introducidos es negativo.
	 */
	public int sumaDosEnteros(int num1, int num2) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Ambos sumandos deben ser positivos");
		}
		return num1 + num2;
	}

	/**
	 * M�todo que devuelve el resultado de la <b>suma de tres n�meros reales</b> introducidos. 
	 * 
	 * @author Manuel Prado Mira
	 * @since 1.0
	 * 
	 * @param num1 El primer sumando.
	 * @param num2 El segundo sumando.
	 * @param num3 El tercer sumando.
	 * @return Devuelve el resultado de sumar los tres valores introducidos.
 	 * @throws IllegalArgumentException Cuando alguno de los n�meros introducidos es negativo.
	 */
	public double sumaTresReales(double num1, double num2, double num3) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0 || num3 < 0) {
			throw new IllegalArgumentException("Todos los sumandos deben ser positivos");
		}
		return num1 + num2 + num3;
	}
	
	/**
	 * M�todo que agrega el valor del par�metro introducido a una variable que acumula el resultado. 
	 * Es una variable est�tica, se puede acceder a ella escribiendo Suma.suma_acumulada.
	 * 
	 * @author Manuel Prado Mira
	 * @since 1.0
	 * 
	 * @param num1 El sumando.
	 * @throws IllegalArgumentException Cuando el n�mero introducido es negativo.
	 */
	public void sumaAcumulada(double num1) throws IllegalArgumentException {
		if (num1 < 0) {
			throw new IllegalArgumentException("El sumando debe ser positivo");
		}
		suma_acumulada+= num1;
	}
}
