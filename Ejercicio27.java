/**Este programa hace presupuestos de tartas.
*AmandaNR*/

public class Ejercicio27 {

	public static void main (String [] args) {
	
		System.out.print("¿De que sabor quiere la tarta (manzana, fresa o chocolate?: ");
		String sabor = System.console().readLine();
		
		double precio = 0;
		switch (sabor) {
			case "manzana":
			precio = 18;
			break;
			case "fresa":
			precio = 16;
			break;
			case "chocolate":
			System.out.print("¿Que tipo de chocolate? (negro o blanco): ");
			String sabor2 = System.console().readLine();
			if (sabor2.equals("negro")) {
				precio = 14;
			} else {
				precio = 15;
			}
		}
		
		System.out.print("¿Quiere añadir nata? (si/no): ");
		String nata = System.console().readLine();
		
		double conNata = 0;
		if (nata.equals("si")) {
			conNata = 2.50;
		} else {
			conNata = 0;
		}
		
		System.out.print("¿Quiere ponerle nombre? (si/no): ");
		String nombre = System.console().readLine();
		
		double conNombre = 0;
		if (nombre.equals("si")) {
			conNombre = 2.50;
		} else {
			conNombre = 0;
		}
			
		double total = precio + conNata + conNombre;
		
		System.out.println("Tarta de "+ sabor +": "+ precio +" Euros");
		System.out.println("Nata "+ nata +": "+ conNata +" Euros");
		System.out.println("Nombre "+ nombre +": "+ conNombre +" Euros");
		System.out.println("Total: "+ total +" Euros");
	
	}
}
