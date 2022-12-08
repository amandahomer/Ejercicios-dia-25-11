/**Este programa calcula la nota del trimestre de la asignatura Programacion
*contando con la recuperacion en caso de haberla realizado.
*AmandaNR*/

import java.util.Scanner;

public class Ejercicio21 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce la nota de los dos examenes seguidos de un espacio: ");
		double primeraNota = s.nextDouble();
		double segundaNota = s.nextDouble();
		
		double media = (primeraNota + segundaNota) / 2;
 
		if (media < 5) {
			System.out.print("Introduce el resultado del examen de recuperacion (APTO/NO APTO): ");
			String recuperacion = s.next();
			if (recuperacion.equals("APTO")) {
				media = 5;
			}
		} 
		
		System.out.println("Tu nota del trimestre es: "+ media);
				
	}
}
