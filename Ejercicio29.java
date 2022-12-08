/**Este programa calcula el precio de un desayuno.
*AmandaNR*/

import java.util.Scanner;

public class Ejercicio29 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.print("¿Que ha tomado de comer? (palmera, donut o pitufo): ");
		String comida = s.nextLine();
	
		double precioComida = 0;
		switch (comida) {
			case "palmera":
			precioComida = 1.40;
			break;
			case "donut":
			precioComida = 1;
			break;
			case "pitufo":
			System.out.print("¿De que era el pitufo? (aceite o tortilla): ");
			String pitufo = s.nextLine();
			if (pitufo.equals("aceite")) {
				precioComida = 1.20;
			} else {
				precioComida = 1.60;
			}
			break;
			default:
		}
	
		System.out.print("¿Que ha tomado de beber? (zumo o cafe): ");
		String bebida = s.nextLine();
	
		double precioBebida = 0;
		if (bebida.equals("zumo")) {
			precioBebida = 1.50;
		} else {
			precioBebida = 1.20;
		}
	
		double total = precioComida + precioBebida;
	
		System.out.println(comida +": "+ precioComida +" Euros");
		System.out.println(bebida +": "+ precioBebida +" Euros");
		System.out.println("Total desayuno: "+ total);
	
	}
}
