package ejercicios_mouredev;

/*
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 */
import java.util.*;

public class Reto7 {
    public static void main(String[] args) {
        String texto = "Esto es una Esto es un prueba prueba2, prueba3 y prueba4 y prueba";
        int length = texto.length();
        for (int i = 0; i < length; i++) {
            if (texto.charAt(i) != ' ' && texto.charAt(i) != '\t' && texto.charAt(i) != '\n') {
                int conteo = 1;
                String palabra = "";
                while (i < length && texto.charAt(i) != ' ' && texto.charAt(i) != '\t' && texto.charAt(i) != '\n') {
                    palabra += texto.charAt(i);
                    i++;
                }
                for (int j = i; j < length; j++) {
                    if (texto.charAt(j) != ' ' && texto.charAt(j) != '\t' && texto.charAt(j) != '\n') {
                        String otraPalabra = "";
                        while (j < length && texto.charAt(j) != ' ' && texto.charAt(j) != '\t'
                                && texto.charAt(j) != '\n') {
                            otraPalabra += texto.charAt(j);
                            j++;
                        }
                        if (palabra.length() == otraPalabra.length()) {
                            boolean igual = true;
                            for (int k = 0; k < palabra.length(); k++) {
                                char c1 = palabra.charAt(k);
                                char c2 = otraPalabra.charAt(k);
                                if (c1 >= 'A' && c1 <= 'Z') {
                                    c1 += 'a' - 'A';
                                }
                                if (c2 >= 'A' && c2 <= 'Z') {
                                    c2 += 'a' - 'A';
                                }
                                if (c1 != c2) {
                                    igual = false;
                                    break;
                                }
                            }
                            if (igual) {
                                conteo++;
                                String nuevoTexto = "";
                                for (int k = 0; k < length; k++) {
                                    if (k < j || k >= j + otraPalabra.length()) {
                                        nuevoTexto += texto.charAt(k);
                                    }
                                }
                                texto = nuevoTexto;
                                length = texto.length();
                                j -= otraPalabra.length();
                            }
                        }
                    }
                }
                System.out.println("Palabra: " + palabra + ", Frecuencia: " + conteo);
            }
        }
    }
}
