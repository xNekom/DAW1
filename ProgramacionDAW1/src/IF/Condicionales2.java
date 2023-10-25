package IF;
import java.util.Scanner;

public class Condicionales2 {

	public static void main(String[] args) {
		// Elaborar un programa que pida un número entre 1 y 7 y muestre el día de la semana al que corresponde.
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("Por favor, introduce el día de la semana: ");
	     int dia = scanner.nextInt();

	     if (dia == 1) {
	    	 System.out.print("Lunes");
	     } else if (dia == 2) {
	    	 System.out.print("Martes");
	     } else if (dia == 3) {
	    	 System.out.print("Miércoles");
	     } else if (dia == 4) {
	     	System.out.print("Jueves");
	     } else if (dia == 5) {
	     	System.out.print("Viernes");
	     } else if (dia == 6) {
	     	System.out.print("Sábado");
	     } else if (dia == 7) {
	     	System.out.print("Domingo");
	     } else {
	     	System.out.print("Solo hay 7 días a la semana.");
	     }
	}
}
