/**Este programa simula el juego de piedra, papel o tijera.
*AmandaNR*/

import java.util.Scanner;

public class Ejercicio28 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Turno del jugador 1 (introduce piedra, papel o tijera): ");
		String jugador1 = s.nextLine();
		System.out.print("Turno del jugador 2 (introduce piedra, papel o tijera): ");
		String jugador2 = s.nextLine();
		
		int ganador = 1;
		
		if (jugador1.equals(jugador2)) {
			System.out.println("Empate");
		} else {
			switch (jugador1) {
				case "piedra":
				if (jugador2.equals("papel")) {
					ganador = 2;
				} 
				break;
				case "papel":
				if (jugador2.equals("tijera")) {
					ganador = 2;
				}
				break;
				case "tijera":
				if (jugador2.equals("piedra")) {
					ganador = 2;
				}
				break;
				default:
			}
		}
					
		System.out.println("Gana jugador "+ ganador);
	
	}
}
