package java_if;

import java.util.Scanner;

public class E2Un_día_más {

	public static void main(String[] args) {
		int day, month, year; // Establecer variables enteras
		Scanner entrada = new Scanner(System.in);

		// Preguntar al usuario
		System.out.println("Introduce el día: ");
		day = entrada.nextInt();
		System.out.println("Introduce el mes: ");
		month = entrada.nextInt();
		System.out.println("Introduce el año: ");
		year = entrada.nextInt();

		// Establecer variable booleana
		boolean fechaCorrecta = true;

		// Establecer las condicionales
		// Mes de febrero
		if ((month == 2) && (day > 0) && (day < 29)) {
			day = day + 1;
			if (day == 29) {
				month = month + 1;
				day = 1;
			}
			// Meses con 31 días
		} else if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) ||
				(month == 10) || (month == 12)) && (day > 0) && (day < 32)) {
			day = day + 1;
			if (day == 32) {
				month = month + 1;
				day = 1;
				if (month == 13) {
					year = year + 1;
					month = 1;
				}
			}
			// Meses con 30 días
		} else if (((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (day > 0) &&
				(day < 31)) {
			day = day + 1;
			if (day == 31) {
				month = month + 1;
				day = 1;
			}
			// Si la fecha no existe
		} else {
			System.out.println("La fecha es incorrecta");
			fechaCorrecta = false;
		}

		if (fechaCorrecta) {
			System.out.println("La fecha es: " + day + "/" + month + "/" + year);
		}

	}
}