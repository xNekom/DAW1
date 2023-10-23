/*Escribir un programa que asigne la ventanilla a un cliente de un banco en función de su edad y de su solicitud. 
El usuario introduce el tipo de cliente y su solicitud en el TPV tecleando un número.
Tipos de clientes:
1. Jubilados
2. Menores de edad
3. No jubilados

Tipos de solicitudes
1. Sacar dinero
2. Ingresar dinero

Acciones: 
- Los jubilados sacan dinero en la ventanilla  10 y si quieren ingresar van a la ventanilla 11
- Los No jubilados sacan dinero en el cajero e ingresan en ventanilla 12
- A los menores de edad se les manda a casa */

import java.util.Scanner;

public class Ventanilla_banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		// Preguntar tipo de cliente
        System.out.println("Introduce el tipo de cliente (1: Jubilados, 2: Menores de edad, 3: No jubilados):");
        int tipoCliente = scanner.nextInt();

		// Preguntar tipo de solicitud
        System.out.println("Introduce el tipo de solicitud (1: Sacar dinero, 2: Ingresar dinero):");
        int tipoSolicitud = scanner.nextInt();

		// Condicionales
        if (tipoCliente == 1) {
            if (tipoSolicitud == 1) {
                System.out.println("Los jubilados sacan dinero en la ventanilla 10.");
            } else if (tipoSolicitud == 2) {
                System.out.println("Los jubilados ingresan dinero en la ventanilla 11.");
            }
        } else if (tipoCliente == 2) {
            System.out.println("Vete a casa");
        } else if (tipoCliente == 3) {
            if (tipoSolicitud == 1) {
                System.out.println("Los no jubilados sacan dinero en el cajero.");
            } else if (tipoSolicitud == 2) {
                System.out.println("Los no jubilados ingresan dinero en la ventanilla 12.");
            }
        } else {
            System.out.println("Tipo de cliente no válido.");
        }
    }
}
