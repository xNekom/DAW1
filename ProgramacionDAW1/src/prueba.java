import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Crear un programa que recoja por consola una fecha expresada en día mes y año

		// y le muestre al usuario la fecha correspondiente al día siguiente.

		// Ejemplo: 28/2/1999 --> más 1 día--> 1/3/1999

		// El programa debe comprobar el código introducido por el usuario para que esté

		// dentro de rango, comprobando que ese mes tiene los días. NO SE TENDRÁN EN

		// CUENTA LOS MESES BISIESTOS.

		int dia, mes, año; // se establecen las variables

		boolean resultado = true;  // se establece variable buleana

		

		

		Scanner entrada = new Scanner(System.in); // Preguntar al usuario

		System.out.println("Introduce día");

		dia = entrada.nextInt();

		System.out.println("Introduce mes");

		mes = entrada.nextInt();

		System.out.println("Introduce año");

		año = entrada.nextInt();

		

		if (((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && (dia == 30)) { // meses de 30 días

			mes = mes + 1;

			dia = 1;

			// año= año;

		}

		

		else if (((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8)) && (dia == 31)) { // meses de 31 días

			mes = mes + 1;

			dia = 1;

			// año = año;

			

		}

		

		else if (mes == 12 && dia == 31) { // último mes del año

			mes = 1;

			dia = 1;

			año = año + 1;

			

		}

		

		else if (mes == 2 && dia == 28) {  // febrero ( es de 28 días)

			mes = mes + 1;

			dia = 1;

			// año = año;

			

		}

		

		else { // suma normal de cualquier día

			dia = dia + 1;			

			// mes = mes;

			// año = año;

			

			

			if (resultado == true) {

				System.out.println (dia + "/" + mes + "/" + año);

			}

			else {

				System.out.println("Fecha incorecta");

			}

		

		}

		

				}

							

		

	}