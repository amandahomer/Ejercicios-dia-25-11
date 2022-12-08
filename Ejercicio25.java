/**Este programa calcula el precio de una bandera segun sus caracteristicas.
*AmandaNR*/

public class Ejercicio25 {

	public static void main (String [] args) {
	
		System.out.print("Introduzca el alto de la bandera en cm: ");
		int alto = Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca el ancho de la bandera en cm: ");
		int ancho = Integer.parseInt(System.console().readLine());
		System.out.print("¿Quiere el escudo bordado? (si/no): ");
		String escudo = System.console().readLine();
		
		int cm = alto * ancho;
		double precio = ((double) alto * (double) ancho) * 0.01;
		
		double precioEscudo = 0;
		if (escudo.equals("si")) {
			precioEscudo = 2.50;
		} else {
			precioEscudo = 0;
		}
		
		double gastosEnvio = 3.25;
		double total = precio + precioEscudo + gastosEnvio;
		
		System.out.println("Detalles de compra:");
		System.out.println("Bandera de "+ cm +" cm2: "+ precio +" Euros");
		System.out.println("Escudo: "+ precioEscudo +" Euros");
		System.out.println("Gastos de envio: "+ gastosEnvio +" Euros");
		System.out.println("TOTAL: "+ total +" Euros");
	
	}
}
