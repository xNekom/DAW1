package FOR;

/*Escribir un programa que deletree desde el final hasta el principio el string: "Cuenta las letras que tiene este string con un bucle FOR"
Debe sacar por consola cada carácter del string uno a uno desde el final hasta el principio, empezando por la "R".

Usar el bucle FOR */

public class E13Deletrear_string {
    public static void main(String[] args) {
        String frase = "Cuenta las letras que tiene este string con un bucle FOR";
        for (int i = frase.length() - 1; i >= 0; i--) {
            char caracter = frase.charAt(i);
            System.out.println(caracter);
        }
    }
}
