package FUNCIONES;
/*Crear un función que, mediante un booleano, indique si el carácter que se le pasa como parámetro de entrada(char) corresponde con una vocal. 
Usa dicha función desde el método principal para comprobar si un carácter introducido por el usuario por consola es o no una vocal.

La clase Scanner no contiene un método tal como 'nextChar()' que recoja un carácter por consola, así que ¿cómo adecuaremos el carácter recibido por consola para pasárselo a nuestra función?.

Busca info en la API de JAVA, en las clases Scanner y String */

import java.util.Scanner;

public class E6Es_vocal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un carácter:");
        String input = scanner.nextLine();
        char character = input.charAt(0); // Obtenemos el primer carácter de la entrada
        System.out.println(esVocal(character));
    }

    public static String esVocal(char vocal) {
        if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u' ||
            vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U') {
            return "Es vocal";
        } else {
            return "No es vocal, es consonante";
        }
    }
}