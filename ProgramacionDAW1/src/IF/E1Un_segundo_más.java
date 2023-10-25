package IF;
import java.util.Scanner;

public class E1Un_segundo_más{

	public static void main(String[] args) {
		int hora, minuto, segundo;  // Establecemos variables
		Scanner entrada = new Scanner(System.in);  // Pedimos que el usuario introduzca datos

		System.out.println("Introduce la hora: ");
		hora = entrada.nextInt();
		System.out.println("Introduce el minuto: ");
		minuto = entrada.nextInt();
		System.out.println("Introduce el segundo: ");
		segundo = entrada.nextInt();

		
		// Hay que anidar una consecución de ifs para poder establecer todas las condiciones sin que una
		// pise a otra.
		if ((hora >= 0) && (hora <= 23)) {
			if ((minuto >= 0) && (minuto <= 59)) {
				if ((segundo >= 0) && (segundo <= 59)) {
					segundo = segundo + 1;
					if (segundo == 60) {
						minuto = minuto + 1;
						segundo = 0;
						if (minuto == 60) {
							hora = hora + 1;
							minuto = 0;
							if (hora == 24) {
								hora = 0;
							}
						}
					}
					
		// Para que los números del rango 1-9 nos den 2 dígitos (Ej: 01, 02, 03) debemos crear nuevas
		// variables de tipo String.
					if (hora < 10 ) {
						String horaStr = "0" + hora;
						if (minuto < 10 ) {
							String minutoStr = "0" + minuto;
							if (segundo < 10 ) {
								String segundoStr = "0" + segundo;
								System.out.println("La hora es: " + horaStr + ":" + minutoStr + ":" + segundoStr);
							}
						}
					}
				} else {
					System.out.println("El segundo introducido no es válido");
				}
			} else {
				System.out.println("El minuto introducido no es válido");
			}
		} else {
			System.out.println("La hora introducida no es válida");
		}	
	}
}
