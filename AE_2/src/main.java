import Calculadora.Suma;
import Calculadora.Resta;
import Calculadora.Cociente;
import Calculadora.Producto;

public class main {
	public static void main(String[] args) {

		// Probamos los m�todos de la clase Suma.
		
		Suma sumando1 = new Suma();
		System.out.println(sumando1.sumaDosEnteros(85, 10));
		System.out.println(sumando1.sumaDosReales(4.22f, 5.37f));
		System.out.println(sumando1.sumaTresReales(5.37f, 3.78f, 5.99f));
		sumando1.sumaAcumulada(6);
		
		// Probamos los m�todos de la clase Resta.
		
		// Probamos los m�todos de la clase Producto.
		
		Producto producto1= new Producto();
        System.out.println(producto1.productoDosEnteros(85, 10));
        System.out.println(producto1.productoDosReales(4.22f, 5.37f));
        System.out.println(producto1.productoTresReales(5.37f, 3.78f, 5.99f));
        System.out.println(producto1.potencia(2,5));
        
		// Probamos los m�todos de la clase Cociente.	

	
	}
}
