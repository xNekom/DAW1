package ejercicios_mouredev;

/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
public class Reto6 {
    public static void main(String[] args) {
        String texto = "Hola mundo";
        for (int i = texto.length() - 1; i >= 0; i--) {
            char textoInvertido = texto.charAt(i);
            System.out.print(textoInvertido);
        }
    }
}
