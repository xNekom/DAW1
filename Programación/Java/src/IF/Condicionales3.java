package IF;
import java.util.Scanner;

public class Condicionales3 {

	public static void main(String[] args) {
		// Pedir día, mes y año e indicar si la fecha es correcta.
		// Tener en cuenta que hay meses con 28, 30 y 31 días
		
		int dia, mes, año; // Se establecen las variables
		boolean resultado = true; // Estableces que el resultado sea tipo booleano
		Scanner entrada = new Scanner(System.in);

		// Pedir al usuario el día, mes y año
		System.out.println("Introduce el día");
		dia = entrada.nextInt();
		System.out.println("Introduce el mes");
		mes = entrada.nextInt();
		System.out.println("Introduce el año");
		año = entrada.nextInt();
		
		if (año == 0) { // Comprobamos el año
			resultado = false;
		}
		else if ((mes == 2) && (dia > 0) && (dia < 29)) { // Comprobamos febrero
			resultado = true;
		}
		else if ((mes == 9) || (mes == 4) || (mes == 6) || (mes == 11) && (dia > 0) && 
				(dia < 31)) { // Comprobamos meses con 30 días
			resultado = true;
		}
		else if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || 
				(mes == 12) && (dia > 0) && (dia < 32)) { // Comprobamos meses con 31 días
			resultado = true;
		}
		else {
			resultado = false;
		}
		if (resultado == true) {
			System.out.println("Fecha correcta");
		}
		else {
			System.out.println("Fecha incorrecta");
		}
	}

}
