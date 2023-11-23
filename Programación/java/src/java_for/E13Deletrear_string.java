package java_for;

/*Escribir un programa que deletree desde el final hasta el principio el string: "Cuenta las letras que tiene este string con un bucle FOR"
Debe sacar por consola cada carácter del string uno a uno desde el final hasta el principio, empezando por la "R".

Usar el bucle FOR */

public class E13Deletrear_string {
    public static void main(String[] args) {
        String frase = "Cuenta las letras que tiene este string con un bucle FOR"; // Declara una cadena de texto
        for (int i = frase.length() - 1; i >= 0; i--) { // Este bucle recorre la cadena de texto de atrás hacia adelante
            char caracter = frase.charAt(i); // Obtiene el carácter actual de la cadena de texto
            System.out.println(caracter); // Imprime el carácter actual
        }
    }
}
