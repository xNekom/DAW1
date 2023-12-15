package java_switch;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// Elaborar un programa que pida un número entre 1 y 7 y muestre el día de la
		// semana al que corresponde (Switch)
		Scanner entrada = new Scanner(System.in);
		System.out.print("Por favor, introduce el día de la semana: ");
		int dia;
		dia = entrada.nextInt();

		switch (dia) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miércoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Datos fuera de rango");
				break;
		}

	}

}
