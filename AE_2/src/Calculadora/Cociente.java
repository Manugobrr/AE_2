package Calculadora;
/**
 * La clase <b>Cociente</b> contiene los m�todos relacionados con las divisiones de la calculadora.
 * Actualmente no estamos controlando los decimales de salida ya que estamos devolviendo 
 * valores num�ricos completos, por si fueran utilizado en otras operaciones.
 * 
 * Comentario para futuras mejoras:
 * Devolviendo Strings de la siguiente forma /return String.format("%.2f", double);/ redondear�a el resultado a dos decimales.
 * 
 * @author Ana L�pez Rodr�guez
 * @version 1.6
 * 
 */

public class Cociente {
	// CONSTRUCTORES
	/**
	 * Constructor est�ndar.
	 */
	public Cociente() {
	}

	
	// M�TODOS
	/**
	 * M�todo que devuelve el resultado de la <b>divisi�n de dos n�meros</b> introducidos. 
	 * 
	 * @author Ana L�pez Rodr�guez
	 * @since 0.8
	 * 
	 * @param num1 El dividendo.
	 * @param num2 El divisor.
	 * @return Devuelve el resultado de dividir los dos valores introducidos.
	 * @deprecated
	 */
	public double cociente(double num1, double num2) throws IllegalArgumentException {/*
		return num1/num2;*/
		return 0;
	}
	
	/**
	 * M�todo que devuelve el resultado de la <b>divisi�n de dos n�meros reales</b> introducidos. 
	 * 
	 * @author Ana L�pez Rodr�guez
	 * @since 1.0
	 * 
	 * @param num1 El dividendo.
	 * @param num2 El divisor.
	 * @return Devuelve el resultado de dividir los dos valores introducidos.
	 * @throws IllegalArgumentException Cuando alguno de los n�meros introducidos es negativo.
	 * @throws IllegalArgumentException Cuando el denominador (segundo par�metro) es igual a 0.
	 */
	public double cocienteDosReales(double num1, double num2) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Ambos n�meros deben ser positivos");
		}
		else if (num2 == 0) {
			throw new IllegalArgumentException("El divisor no puede ser 0");	
		}
		return num1/num2;
	}
	
	/**
	 * M�todo que devuelve el resultado de la <b>divisi�n de dos n�meros enteros</b> introducidos. 

	 * 
	 * @author Ana L�pez Rodr�guez
	 * @since 1.0
	 * 
	 * @param num1 El dividendo.
	 * @param num2 El divisor.
	 * @return Devuelve el resultado de dividir los dos valores introducidos.
	 * @throws IllegalArgumentException Cuando alguno de los n�meros introducidos es negativo.
	 * @throws IllegalArgumentException Cuando el denominador (segundo par�metro) es igual a 0.
	 */
	public double cocienteDosEnteros(int num1, int num2) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Ambos n�meros deben ser positivos");
		}
		else if (num2 == 0) {
			throw new IllegalArgumentException("El divisor no puede ser 0");	
		}
		return (double)num1/(double)num2; //convertimos los n�meros a double para obtener los decimales, en caso contrario obtendr�amos solo el cociente de la divisi�n. 
	}

	/**
	 * M�todo que devuelve el resultado de <b>invertir un n�mero real</b> introducido. 
	 * 
	 * @author Ana L�pez Rodr�guez
	 * @since 1.0
	 * 
	 * @param num1 El n�mero que queremos invertir.
	 * @return Devuelve el resultado de multiplicar los tres valores introducidos.
	 * @throws IllegalArgumentException Cuando el n�mero introducido es negativo.
	 * @throws IllegalArgumentException Cuando el n�mero introducido es igual a 0.
	 */
	public double inverso(double num1) throws IllegalArgumentException {
		if (num1 < 0) {
			throw new IllegalArgumentException("El n�mero debe ser positivo");
		}
		else if (num1 == 0) {
			throw new IllegalArgumentException("El n�mero no puede ser 0");	
		}
		return 1/num1;
	}
	
	/**
	 * M�todo que devuelve el resultado de la <b>ra�z cuadrada de un n�mero real</b> introducido. 

	 * 
	 * @author Ana L�pez Rodr�guez
	 * @since 1.0
	 * 
	 * @param num1 - El n�mero del que queremos calcular la ra�z cuadrada.
	 * @return Devuelve el resultado de la ra�z cuadrada del valor introducido.
	 * @throws IllegalArgumentException Cuando el n�mero introducido es negativo.
	 */
	public double raiz(double num1) throws IllegalArgumentException {
		if (num1 < 0) {
			throw new IllegalArgumentException("El n�mero debe ser positivo");
		}
		return Math.sqrt(num1);
	}
}