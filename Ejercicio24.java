/**Este programa genera la nomina desglosada de un empleado segun unas caracteristicas.
 * AmandaNR*/
 
 public class Ejercicio24 {
	 
	 public static void main (String [] args) {
		 
		 System.out.println("Elige una opcion:");
		 System.out.println("1. Programador junior");
		 System.out.println("2. Programador senior");
		 System.out.println("3. Jefe de proyecto");
		 System.out.println("Introduzca el cargo del empleado (1 - 3): ");
		 int cargo = Integer.parseInt(System.console().readLine());
		 System.out.println("¿Cuantos dias ha estado de viaje de negocios? ");
		 int viaje = Integer.parseInt(System.console().readLine());
		 System.out.println("¿Cual es su estado civil? (1. casado, 2. soltero");
		 int estadoCivil = Integer.parseInt(System.console().readLine());
		 
		 int sueldoBase = 0;
		 switch (cargo) {
			 
			 case 1:
			 sueldoBase = 950;
			 break;
			 case 2:
			 sueldoBase = 1200;
			 break;
			 case 3:
			 sueldoBase = 1600;
			 break;
			 default:
			 System.out.println("Introduzca un cargo correcto.");
		}
			 
		int dietas = viaje * 30;
		int sueldoBruto = sueldoBase + dietas;
		
		String irpf;
		double retencionIrpf = 0;
		if (estadoCivil == 1) {
			irpf = "(20%)";
			retencionIrpf = sueldoBruto * 0.2;
		} else {
			irpf = "(25%)";
			retencionIrpf = sueldoBase * 0.25;
		}
		
		double sueldoNeto = sueldoBruto - retencionIrpf;
		
		System.out.println("------------------------------");
		System.out.println("| Sueldo base: 	"+ sueldoBase);
		System.out.println("| Dietas ("+ viaje +" viajes): "+ dietas);
		System.out.println("|----------------------------");
		System.out.println("| Sueldo bruto: "+ sueldoBruto);
		System.out.println("| Retencion IRFP "+ irpf +": "+ retencionIrpf);
		System.out.println("|----------------------------");
		System.out.println("| Sueldo neto:	 "+ sueldoNeto);
		System.out.println("------------------------------");
		 
	}
}
