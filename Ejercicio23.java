/**Este programa calcula el precio final de un producto a partir de su base imposible.
*AmandaNR*/

public class Ejercicio23 {

	public static void main (String [] args) {
	
		System.out.print("Introduzca la base imponible: ");
		double baseImp = Double.parseDouble(System.console().readLine());
		
		System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		String resultadoIva = System.console().readLine();
		
		System.out.print("Introduzca el codigo promocional (nopro, mitad, meno5 o 5porc): ");
		String resultadoPromo = System.console().readLine();
		
		int tipoIva = 0;
		switch (resultadoIva) {
			
			case "general":
			tipoIva = 21;
			break;
			case "reducido":
			tipoIva = 19;
			break;
			case "superreducido":
			tipoIva = 4;
			break;
			default:
			System.out.println("Introduce un tipo de IVA correcto.");
		}
		
		double iva = (tipoIva * baseImp) / 100;
		double precioSinPromo = baseImp + iva;
		
		
		double promo = 0;
		switch (resultadoPromo) {
			
			case "no pro":
			break;
			case "mitad":
			promo = precioSinPromo / 2;
			break;
			case "meno5":
			promo = 5;
			break;
			case "5porc":
			promo = (5 * precioSinPromo) / 100;
			break;
			default:
			System.out.println("Introduce un codigo promocional correcto.");
		}
		
		double total = precioSinPromo - promo;
		
		System.out.println("Base imponible: "+ baseImp);
		System.out.println("IVA ("+ tipoIva +"%): "+ iva);
		System.out.println("Precio con IVA: "+ precioSinPromo);
		System.out.println("Codigo promocion ("+ resultadoPromo +"): "+ promo);
		System.out.println("TOTAL :"+ total);
		
	}
}


