/**Este programa pide un dia y una hora y calcula los minutos que quedan
*hasta el fin de semana.
*AmandaNR*/

public class Ejercicio22 {

	public static void main (String [] args) {
	
		System.out.print("Introduce un dia de la semana (de lunes a viernes): ");
		String dia = System.console().readLine();
		
		System.out.print("Introduce la hora: ");
		int hora = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce los minutos: ");
		int minutos = Integer.parseInt(System.console().readLine());
		
		int dias = 0;
		switch (dia) {
			
			case "lunes":
			dias = 0;
			break;
			
			case "martes":
			dias = 1;
			break;
			
			case "miercoles":
			dias = 2;
			break;
			
			case "jueves":
			dias = 3;
			break;
			
			case "viernes":
			dias = 4;
			break;
			
			default:
				System.out.println("Introduce un dia correcto");
		}
	
		int minutosTotalSemana = (4 * 24 * 60) + (15 * 60);
		int minutosUsuario = ((dias * 24 * 60) + (hora * 60)+ minutos);
		int	total = minutosTotalSemana - minutosUsuario;
		
		if (total < 0) {
			System.out.print("Ya estas en el fin de semana.");
		} else {
			System.out.println("Quedan "+ total +" minutos para el fin de semana");
		}
	}
}

