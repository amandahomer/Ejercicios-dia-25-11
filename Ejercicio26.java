/**Este programa calcula el precio de unas entradas de cine.
*AmandaNR*/

public class Ejercicio26 {

	public static void main (String [] args) {
	
		System.out.println("Venta de entradas CineCampa");
		System.out.print("Numero de entradas: ");
		int numEntrada = Integer.parseInt(System.console().readLine());
		
		System.out.print("Dia de la semana: ");
		String dia = System.console().readLine();
		
		System.out.print("¿Tiene tarjeta CineCampa? (si/no): ");
		String tarjeta = System.console().readLine();
	
		int precioEntr = 8;
		int entradaPareja = 0;
		double totalEntradas = 0;
		double descuento = 0;
		double total = 0;
		
		switch (dia) {
			case "miercoles":
			precioEntr = 5;
			totalEntradas = numEntrada * precioEntr;
			break;
			case "jueves":
			entradaPareja = numEntrada / 2;
			if (entradaPareja % 2 == 0) {
			totalEntradas = entradaPareja * 11;
			} else {
			totalEntradas = (entradaPareja * 11) + precioEntr;
			}
			break;
			default:
			totalEntradas = precioEntr * numEntrada;
		}
		
		if (tarjeta.equals("si")) {
			descuento = totalEntradas * 0.10;
		} else {
			descuento = 0;
		}
		
		total = totalEntradas - descuento;
		
		System.out.println("Precio entradas: "+ totalEntradas +" Euros");
		System.out.println("Descuento: "+ descuento +" Euros");
		System.out.println("Total: "+ total +" Euros");
		
	}
}
