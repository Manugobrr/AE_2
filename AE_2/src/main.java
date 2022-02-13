import Calculadora.Suma;
import Calculadora.Resta;
import Calculadora.Cociente;
import Calculadora.Producto;

public class main {
	public static void main(String[] args) {

		// Probamos los métodos de la clase Suma.

		Suma sumando1 = new Suma();
		System.out.println(sumando1.sumaDosEnteros(85, 10));
		System.out.println(sumando1.sumaDosReales(4.22f, 5.37f));
		System.out.println(sumando1.sumaTresReales(5.37f, 3.78f, 5.99f));
		sumando1.sumaAcumulada(6);

		// Probamos los métodos de la clase Resta.

		Resta resta1 = new Resta();
		System.out.println(resta1.restaDosEnteros(85, 10));
		System.out.println(resta1.restaDosReales(4.22f, 5.37f));
		System.out.println(resta1.restaTresReales(5.37f, 3.78f, 5.99f));
		resta1.restaAcumulada(6);

		// Probamos los métodos de la clase Producto.

		Producto producto1 = new Producto();
		System.out.println(producto1.productoDosEnteros(85, 10));
		System.out.println(producto1.productoDosReales(4.22f, 5.37f));
		System.out.println(producto1.productoTresReales(5.37f, 3.78f, 5.99f));
		System.out.println(producto1.potencia(2, 5));

		// Probamos los métodos de la clase Cociente.

		Cociente valor = new Cociente();
		System.out.println(valor.cocienteDosEnteros(50, 10));
		System.out.println(valor.cocienteDosReales(3.14f, 2.1f));
		System.out.println(valor.inverso(2.7f));
		System.out.println(valor.raiz(3.33f));
	}
}