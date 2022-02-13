package Calculadora;
/**
 * La clase <b>Cociente</b> contiene los métodos relacionados con las divisiones de la calculadora.
 * Actualmente no estamos controlando los decimales de salida ya que estamos devolviendo 
 * valores numéricos completos, por si fueran utilizado en otras operaciones.
 * 
 * Comentario para futuras mejoras:
 * Devolviendo Strings de la siguiente forma /return String.format("%.2f", double);/ redondearía el resultado a dos decimales.
 * 
 * @author Ana López Rodríguez
 * @version 1.6
 * 
 */

public class Cociente {
	// CONSTRUCTORES
	/**
	 * Constructor estándar.
	 */
	public Cociente() {
	}

	
	// MÉTODOS
	/**
	 * Método que devuelve el resultado de la <b>división de dos números</b> introducidos. 
	 * 
	 * @author Ana López Rodríguez
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
	 * Método que devuelve el resultado de la <b>división de dos números reales</b> introducidos. 
	 * 
	 * @author Ana López Rodríguez
	 * @since 1.0
	 * 
	 * @param num1 El dividendo.
	 * @param num2 El divisor.
	 * @return Devuelve el resultado de dividir los dos valores introducidos.
	 * @throws IllegalArgumentException Cuando alguno de los números introducidos es negativo.
	 * @throws IllegalArgumentException Cuando el denominador (segundo parámetro) es igual a 0.
	 */
	public double cocienteDosReales(double num1, double num2) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Ambos números deben ser positivos");
		}
		else if (num2 == 0) {
			throw new IllegalArgumentException("El divisor no puede ser 0");	
		}
		return num1/num2;
	}
	
	/**
	 * Método que devuelve el resultado de la <b>división de dos números enteros</b> introducidos. 

	 * 
	 * @author Ana López Rodríguez
	 * @since 1.0
	 * 
	 * @param num1 El dividendo.
	 * @param num2 El divisor.
	 * @return Devuelve el resultado de dividir los dos valores introducidos.
	 * @throws IllegalArgumentException Cuando alguno de los números introducidos es negativo.
	 * @throws IllegalArgumentException Cuando el denominador (segundo parámetro) es igual a 0.
	 */
	public double cocienteDosEnteros(int num1, int num2) throws IllegalArgumentException {
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Ambos números deben ser positivos");
		}
		else if (num2 == 0) {
			throw new IllegalArgumentException("El divisor no puede ser 0");	
		}
		return (double)num1/(double)num2; //convertimos los números a double para obtener los decimales, en caso contrario obtendríamos solo el cociente de la división. 
	}

	/**
	 * Método que devuelve el resultado de <b>invertir un número real</b> introducido. 
	 * 
	 * @author Ana López Rodríguez
	 * @since 1.0
	 * 
	 * @param num1 El número que queremos invertir.
	 * @return Devuelve el resultado de multiplicar los tres valores introducidos.
	 * @throws IllegalArgumentException Cuando el número introducido es negativo.
	 * @throws IllegalArgumentException Cuando el número introducido es igual a 0.
	 */
	public double inverso(double num1) throws IllegalArgumentException {
		if (num1 < 0) {
			throw new IllegalArgumentException("El número debe ser positivo");
		}
		else if (num1 == 0) {
			throw new IllegalArgumentException("El número no puede ser 0");	
		}
		return 1/num1;
	}
	
	/**
	 * Método que devuelve el resultado de la <b>raíz cuadrada de un número real</b> introducido. 

	 * 
	 * @author Ana López Rodríguez
	 * @since 1.0
	 * 
	 * @param num1 - El número del que queremos calcular la raíz cuadrada.
	 * @return Devuelve el resultado de la raíz cuadrada del valor introducido.
	 * @throws IllegalArgumentException Cuando el número introducido es negativo.
	 */
	public double raiz(double num1) throws IllegalArgumentException {
		if (num1 < 0) {
			throw new IllegalArgumentException("El número debe ser positivo");
		}
		return Math.sqrt(num1);
	}
}