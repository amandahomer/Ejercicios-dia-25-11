/**Este programa pide un numero de hasta 5 cifras y dice si es capicua o no.
*AmandaNR*/

public class Ejercicio20 {

	public static void main (String [] args) {
	
		int numero;
		System.out.print("Introduce un numero de 5 cifras como maximo: ");
		numero = Integer.parseInt(System.console().readLine());
		
		boolean resultado = false;
		if (numero < 10) {
			resultado = true;
		}
		if ((numero >= 10) && (numero < 100)) {
			if ((numero / 10) == (numero % 10)) {
				resultado = true;
			}
		}
		if ((numero >= 100) && (numero <1000)) {
			if ((numero / 100) == (numero % 10)) {
				resultado = true;
			}
		}
		if ((numero >= 1000) && (numero < 10000)) {
			if (((numero / 1000) == (numero % 10)) && (((numero / 1000) % 10) == ((numero % 10) % 10))) {
					resultado = true;
			}
		}
		if (numero >= 10000) {
			if (((numero / 10000) == (numero % 10)) && (((numero / 10000) % 10) == ((numero % 10) % 10))) {
					resultado = true;
			}
		}
		
		if (resultado == true) {
			System.out.println("El numero introducido es capicúa.");
		} else {
			System.out.println("El numero introducido no es capicúa.");
		}
	}
}
